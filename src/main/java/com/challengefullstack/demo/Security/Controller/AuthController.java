package com.challengefullstack.demo.Security.Controller;

import com.challengefullstack.demo.Security.Dto.JwtDto;
import com.challengefullstack.demo.Security.Dto.LoginUser;
import com.challengefullstack.demo.Security.Dto.NuevoUser;
import com.challengefullstack.demo.Security.Entity.User;
import com.challengefullstack.demo.Security.Jwt.JwtProvider;
import com.challengefullstack.demo.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserService userService;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Validated @RequestBody NuevoUser nuevoUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);


        if(userService.existsByDocumento(nuevoUser.getDocumento()))
            return new ResponseEntity(new Mensaje("Ese nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);

        User usuario = new User(nuevoUser.getId(),nuevoUser.getDocumento(), passwordEncoder.encode(nuevoUser.getClave()));

        userService.save(usuario);

        return new ResponseEntity(new Mensaje("Usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Validated @RequestBody LoginUser loginUsuario, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campo mal puesto"), HttpStatus.BAD_REQUEST);

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginUsuario.getDocumento(), loginUsuario.getClave()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateToken(authentication);

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

            JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername());

        return new ResponseEntity(jwtDto, HttpStatus.OK);

    }

}

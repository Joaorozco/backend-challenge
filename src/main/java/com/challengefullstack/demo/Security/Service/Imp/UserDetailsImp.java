package com.challengefullstack.demo.Security.Service.Imp;

import com.challengefullstack.demo.Security.Entity.User;
import com.challengefullstack.demo.Security.Entity.UserPrincipal;
import com.challengefullstack.demo.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService {
    @Autowired
    private UserService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String documento) throws UsernameNotFoundException {
        User user = usuarioService.getByDocumento(documento).get();
        return UserPrincipal.build(user);
    }
}

package com.challengefullstack.demo.Security.Service;

import com.challengefullstack.demo.Security.Dto.NuevoUser;
import com.challengefullstack.demo.Security.Entity.User;
import com.challengefullstack.demo.Security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Optional<User> getByDocumento(String documento){
        return userRepository.findByDocumento(documento);
    }

    public boolean existsByDocumento(String documento){
        return userRepository.existsByDocumento(documento);
    }


    public void save(User usuario) {
        userRepository.save(usuario);
    }
}

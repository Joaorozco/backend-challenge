package com.challengefullstack.demo.Security.Repository;

import com.challengefullstack.demo.Security.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    Optional<User> findByDocumento(String documento);
    boolean existsByDocumento(String documento);

}

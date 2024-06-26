package com.nielo.springsecuritybasicauth.springsecuritybasicauth.repository;

import com.nielo.springsecuritybasicauth.springsecuritybasicauth.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findUserByUsername(String username);
}

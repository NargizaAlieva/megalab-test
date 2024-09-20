package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.Optional;

public interface UserService {
    User register(User user);
    Optional<User> getUser(Long id);
    User updateUser(User user);
    void deleteUser(Long id);
}

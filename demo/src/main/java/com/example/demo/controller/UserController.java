package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "user")
public class UserController {
    private UserService userService;

    @GetMapping(value = "get-user")
    public Optional<User> getUser(@RequestParam Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping(value = "delete-user")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }

    @PostMapping(value = "register-user")
    public User registerUser (@RequestBody User user) {
        return userService.register(user);
    }
}

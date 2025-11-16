package com.julio.marketplace_backend.controller;

import com.julio.marketplace_backend.model.User;
import com.julio.marketplace_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    // Inyección por constructor
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET /api/users  -> lista todos los usuarios
    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    // POST /api/users/demo  -> crea 1 usuario de prueba
@PostMapping
public User createUser(@RequestBody User user) {
    return userRepository.save(user);
}
}

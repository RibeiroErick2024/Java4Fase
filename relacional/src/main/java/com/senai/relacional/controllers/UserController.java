package com.senai.relacional.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.senai.relacional.entities.User;
import com.senai.relacional.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<?> createUser() {

        List<User> users = new ArrayList<>();
        try {

            users = userRepository.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok(users);
    }

}

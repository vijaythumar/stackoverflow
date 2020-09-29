package io.vijay.stackoverflow.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //Http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(){
        return "Get user was Called";
    }

    @PostMapping
    public String createUser(){
        return "Create user was Called";
    }

    @PutMapping
    public String updateUser(){
        return "Updated user was Called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete user was Called";
    }
}

package com.example.springSecurity.controller;

import com.example.springSecurity.entity.User;
import com.example.springSecurity.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/auth")
    public String auth(Principal principal) {
        User person = userService.findByUsername(principal.getName());

        return "secured part of web servies: " + person.getUsername() + " " + person.getEmail();
    }

    @GetMapping("/user")
    public String user(Principal principal) {

        return "user: " + principal.getName();
    }

    @GetMapping("/admin")
    public String admin(Principal principal) {

        return "admin: " + principal.getName();
    }
}

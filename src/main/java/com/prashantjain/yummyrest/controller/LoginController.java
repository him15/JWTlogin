package com.prashantjain.yummyrest.controller;


import com.prashantjain.yummyrest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        boolean isValidUser = loginService.validateUser(email, password);
        if (isValidUser) {
            return "Login successful!";
        } else {
            return "Invalid email or password!";
        }
    }

}

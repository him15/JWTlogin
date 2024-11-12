package com.prashantjain.yummyrest.service;


import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String email, String password) {
        // Hardcoded email and password for simplicity
        // In real applications, fetch these details from a database
        return "test@example.com".equals(email) && "password123".equals(password);
    }
}

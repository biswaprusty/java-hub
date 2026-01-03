package com.school.sms.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(String username, String password) {
        // JWT logic will be added later
        return "LOGIN_SUCCESS";
    }

    public String register(String username, String password) {
        // user registration logic later
        return "REGISTER_SUCCESS";
    }
}

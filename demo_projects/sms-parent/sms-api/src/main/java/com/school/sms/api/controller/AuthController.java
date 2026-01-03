package com.school.sms.api.controller;

import com.school.sms.auth.jwt.JwtTokenProvider;
import com.school.sms.common.dto.LoginRequest;
import com.school.sms.common.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenProvider jwtTokenProvider;

    public AuthController(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

        // TEMP: hardcoded role
        String role = "ADMIN";

        String token = jwtTokenProvider.generateToken(
                request.getUsername(), role
        );

        return ResponseEntity.ok(
                new LoginResponse(token, request.getUsername(), role)
        );
    }
}

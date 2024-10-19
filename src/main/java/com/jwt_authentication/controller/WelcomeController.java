package com.jwt_authentication.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
@RequiredArgsConstructor
public class WelcomeController {

    @GetMapping("/home")
    public ResponseEntity<String> register() {
        return ResponseEntity.ok("Welcome jwt secured home");
    }
}

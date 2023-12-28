package org.example.web.controller;

import org.example.web.entity.Account;
import org.example.web.service.MainService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {

    @Resource
    private MainService mainService;

    @GetMapping("/")
    public String index() {
        return "Hello, World!";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Account account) {
        if (mainService.validateAccount(account.getUsername(), account.getPassword())) {
            return ResponseEntity.ok("Login success!");
        } else {
            return ResponseEntity.badRequest().body("Login failed!");
        }
    }
}

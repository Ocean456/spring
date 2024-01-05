package org.example.web.controller;

import org.example.web.dto.LoginForm;
import org.example.web.entity.Account;
import org.example.web.service.MainService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginForm loginForm) {
        Account account = mainService.validateAccount(loginForm.getUsername(), loginForm.getPassword());
        if (account == null) {
            return ResponseEntity.status(401).body(Collections.singletonMap("message", "Invalid username or password"));
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("username", account.getUsername());
            response.put("role", String.valueOf(account.getRole()));
            response.put("message", "Login successfully");
            return ResponseEntity.ok(response);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Account account) {
        if (mainService.createAccount(account)) {
            return ResponseEntity.ok(Collections.singletonMap("message", "Register successfully"));
        } else {
            return ResponseEntity.status(500).body(Collections.singletonMap("message", "Register failed"));
        }
    }
    @PostMapping("/updateuser")
    public void update(@RequestBody Map<String,String> request){
        String username=request.get("username");
        String password=request.get("password");
        mainService.update_user(username,password);
    }
    @GetMapping("/getpassword")
    public String get(String username){
        return mainService.get_password(username);
    }
}

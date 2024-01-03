package org.example.web.controller;

import jakarta.annotation.Resource;
import org.example.web.dto.ApplicationForm;
import org.example.web.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Resource
    private ApplicationService applicationService;

    @GetMapping("/applications")
    public ResponseEntity<?> getAllApplications() {
        return ResponseEntity.ok(applicationService.getAllApplications());
    }


    @PutMapping("/application")
    public ResponseEntity<?> updateApplication(@RequestBody ApplicationForm applicationForm) {
        return ResponseEntity.ok(applicationService.updateApplication(applicationForm.getApplicationId(), applicationForm.getApplicationStatus()));
    }


}

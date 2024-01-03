package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.entity.Attendance;
import org.example.web.service.AttendanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;

    @GetMapping("/attendances")
    public ResponseEntity<?> getAllAttendances() {
        return ResponseEntity.ok(attendanceService.getAllAttendances());

    }

    @PostMapping("/attendance")
    public ResponseEntity<?> createAttendance(@RequestBody Attendance attendance) {
        return ResponseEntity.ok(attendanceService.createAttendance(attendance));
    }

    @PutMapping("/attendance")
    public ResponseEntity<?> updateAttendance(@RequestBody Attendance attendance) {
        return ResponseEntity.ok(attendanceService.updateAttendance(attendance));
    }
}

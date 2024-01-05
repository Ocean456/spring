package org.example.web.controller;


import jakarta.annotation.Resource;
import org.example.web.entity.Attendance;
import org.example.web.entity.Config;
import org.example.web.mapper.ConfigMapper;
import org.example.web.service.AttendanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;

    @Resource
    private ConfigMapper configMapper;

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


    @GetMapping("/attendance")
    public List<Date> getAttendanceByEmployeeId(@RequestParam Integer employeeId) {
        return attendanceService.getAttendanceByEmployeeId(employeeId);
    }

    @GetMapping("/config/attendance")
    public ResponseEntity<?> getAttendanceConfig() {
        return ResponseEntity.ok(configMapper.selectById(1));
    }

    @PutMapping("/config/attendance")
    public ResponseEntity<?> updateAttendanceConfig(@RequestBody Config config) {
        return ResponseEntity.ok(configMapper.updateById(config));
    }
}

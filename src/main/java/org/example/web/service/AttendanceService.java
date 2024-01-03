package org.example.web.service;


import jakarta.annotation.Resource;
import org.example.web.entity.Attendance;
import org.example.web.mapper.AttendanceMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    @Resource
    private AttendanceMapper attendanceMapper;


    public List<Attendance> getAllAttendances() {
        return attendanceMapper.selectList(null);
    }


    public Boolean createAttendance(Attendance attendance) {
        return attendanceMapper.insert(attendance) > 0;

    }

    public Boolean updateAttendance(Attendance attendance) {
        return attendanceMapper.updateById(attendance) > 0;
    }
}

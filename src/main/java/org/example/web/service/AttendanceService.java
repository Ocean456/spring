package org.example.web.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.example.web.entity.Attendance;
import org.example.web.mapper.AttendanceMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Date> getAttendanceByEmployeeId(Integer employeeId) {
        QueryWrapper<Attendance> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("EmployeeId", employeeId);

        return attendanceMapper.selectList(queryWrapper)
                .stream()
                .map(Attendance::getAttendanceDate)
                .collect(Collectors.toList());
    }
}

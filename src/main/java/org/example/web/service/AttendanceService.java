package org.example.web.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.example.web.entity.Attendance;
import org.example.web.entity.Employee;
import org.example.web.mapper.AttendanceMapper;
import org.example.web.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class AttendanceService {

    @Resource
    private AttendanceMapper attendanceMapper;

    @Resource
    private EmployeeMapper employeeMapper;


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


    public Boolean setAttendance(String employeePhone) {
        Employee employee = employeeMapper.selectOne(new QueryWrapper<Employee>().eq("EmployeePhone", employeePhone));
        if (employee == null) {
            return false;
        }else {
            Attendance attendance = new Attendance();
            attendance.setEmployeeId(employee.getEmployeeID());
            attendance.setAttendanceDate(new Date());
            attendance.setAttendanceStatus("1");
            attendance.setAttendanceTime(new Date());
            return attendanceMapper.insert(attendance) > 0;
        }
    }
}

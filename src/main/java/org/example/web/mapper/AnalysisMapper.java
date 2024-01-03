package org.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.web.entity.Employee;

import java.time.LocalDate;

@Mapper
public interface AnalysisMapper extends BaseMapper<Employee> {
    @Select("SELECT COUNT(*) FROM employee WHERE EmployeeGender = #{gender}")
    int countByEmployeeGender(@Param("gender") String gender);
    @Select("SELECT COUNT(*) FROM employee WHERE EmployeeDepartment = #{department}")
    int countByEmployeeDepartment(@Param("department") String department);
    @Select("SELECT COUNT(*) FROM employee WHERE EmployeeAge BETWEEN #{startAge} AND #{endAge}")
    int countByEmployeeAge(@Param("startAge") int startAge, @Param("endAge") int endAge);
    @Select("SELECT COUNT(*) FROM employee WHERE EmployeeHireDate BETWEEN #{startDate} AND #{endDate}")
    int countByEmployeeHireDate(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
    @Select("SELECT COUNT(*) FROM employee WHERE EmployeeAddress LIKE CONCAT('%', #{address}, '%')")
    int countByEmployeeAddress(@Param("address") String address);
}

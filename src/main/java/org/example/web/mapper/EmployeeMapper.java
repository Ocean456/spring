package org.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.web.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


}

package org.example.web.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.web.entity.Attendance;

@Mapper
public interface AttendanceMapper extends BaseMapper<Attendance> {
}

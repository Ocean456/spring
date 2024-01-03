package org.example.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.web.entity.Application;

@Mapper
public interface ApplicationMapper extends BaseMapper<Application> {
}

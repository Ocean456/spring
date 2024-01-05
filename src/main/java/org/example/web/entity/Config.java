package org.example.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("config")
public class Config {
    private Integer id;
    private String name;
    private String value;
}

package org.example.web.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("basic")
public class Basic {
    private String id;
    private String name;
    private String gender;
    private String birthday;
    private String address;
}

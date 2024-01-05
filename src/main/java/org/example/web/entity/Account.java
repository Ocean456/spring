package org.example.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("account")
public class Account {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String username;
    private String password;
    private Role role;
}


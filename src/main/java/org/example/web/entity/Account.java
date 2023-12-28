package org.example.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("account")
public class Account {
    private Long id;
    private String username;
    private String password;
    private Role role;
}

enum Role {
    ADMIN,
    USER
}
package org.example.web.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.example.web.entity.Account;
import org.example.web.mapper.AccountMapper;
import org.springframework.stereotype.Service;


@Service
public class MainService {
    @Resource
    private AccountMapper accountMapper;

    public Account validateAccount(String username, String password) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        queryWrapper.eq("password", password);
        return accountMapper.selectOne(queryWrapper);
    }
}

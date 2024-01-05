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

    public Boolean createAccount(Account account) {
        return accountMapper.insert(account) > 0;
    }

    public Boolean updateAccount(Account account) {
        return accountMapper.updateById(account) > 0;
    }

    public Boolean deleteAccount(Integer accountId) {
        return accountMapper.deleteById(accountId) > 0;
    }
    public void update_user(String username,String password){
       QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        Account account=accountMapper.selectOne(queryWrapper);
        System.out.println(account);
        account.setPassword(password);
        accountMapper.updateById(account);
    }
    public String get_password(String username){
        QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        Account account=accountMapper.selectOne(queryWrapper);
        System.out.println(account);
        return account.getPassword();
    }
}

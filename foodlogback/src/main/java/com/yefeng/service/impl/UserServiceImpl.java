package com.yefeng.service.impl;

import com.yefeng.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: 叶枫
 * @Date: 2025/04/17/23:35
 * @Description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        return 0;
    }
}

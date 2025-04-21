package com.yefeng.service;

import com.yefeng.model.entity.User;
import com.yefeng.model.vo.LoginUserVO;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @Author: 叶枫
 * @Date: 2025/04/17/23:30
 * @Description:
 */
public interface UserService {
    long userRegister(String userAccount, String userPassword, String checkPassword);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    LoginUserVO getLoginUserVO(User user);
}

package com.yefeng.model.entity;

import lombok.Data;

/**
 * @Author: 叶枫
 * @Date: 2025/04/17/23:26
 * @Description: 用户实体
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String userAccount;
    private String userPassword;
    private String userAvatar;
    private String userProfile;
    private String userRole;
    private String createTime;
    private String updateTime;
}

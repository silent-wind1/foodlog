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
    private String name;
    private String userAccount;
    private String password;
    private String avatar;
    private String createTime;
    private String updateTime;
}

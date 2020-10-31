package com.jack.weiyi.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Description: User用户实体类
 * @Create: 2020-10-31-12:16
 * @Author:
 */

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int role;
    private int status;
    private String activationCode;
    private String headerUrl;
    private LocalDateTime createTime;
}

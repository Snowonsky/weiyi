package com.jack.weiyi.service.impl;

import com.jack.weiyi.entity.User;
import com.jack.weiyi.mapper.UserMapper;
import com.jack.weiyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Create: 2020-10-31-13:08
 * @Author:
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}

package com.jack.weiyi.service;

import com.jack.weiyi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    User findUserById(int id);
}

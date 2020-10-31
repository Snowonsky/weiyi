package com.jack.weiyi.controller;

import com.jack.weiyi.service.DiscussService;
import com.jack.weiyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Create: 2020-10-31-13:10
 * @Author:
 */
@RestController
public class HomeController {

    @Autowired
    private DiscussService discussService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage() {
        return null;
    }
}

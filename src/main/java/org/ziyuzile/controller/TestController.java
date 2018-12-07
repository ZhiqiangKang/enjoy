package org.ziyuzile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ziyuzile.annotation.RequestLog;
import org.ziyuzile.model.User;
import org.ziyuzile.service.UserService;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @RequestLog("根据id查询用户")
    public User test(String id){
        User user = userService.queryUserById(id);

        return user;
    }

    @RequestMapping("/add")
    @RequestLog("根据id查询用户")
    public User add(User user){
        user = userService.addUser(user);

        return user;
    }
}

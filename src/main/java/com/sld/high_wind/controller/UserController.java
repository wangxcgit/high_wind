package com.sld.high_wind.controller;

import com.sld.high_wind.Bean.User;
import com.sld.high_wind.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @PostMapping("/findUser")
    public User findByName(String name){
        return userService.findByName(name);
    }

}

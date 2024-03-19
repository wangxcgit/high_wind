package com.sld.high_wind.service.impl;

import com.sld.high_wind.Bean.User;
import com.sld.high_wind.mapper.UserMapper;
import com.sld.high_wind.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}

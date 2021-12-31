package com.orange.pagehelper.service.impl;

import com.orange.pagehelper.entity.User;
import com.orange.pagehelper.mapper.UserMapper;
import com.orange.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUser() {
        return userMapper.listAllUser();
    }
}

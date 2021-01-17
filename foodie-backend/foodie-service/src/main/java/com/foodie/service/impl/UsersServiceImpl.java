package com.foodie.service.impl;

import com.foodie.mapper.UsersMapper;
import com.foodie.pojo.Users;
import com.foodie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> list() {
        return usersMapper.selectAll();
    }
}

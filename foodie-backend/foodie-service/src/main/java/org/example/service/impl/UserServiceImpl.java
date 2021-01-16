package org.example.service.impl;

import org.example.mapper.UsersMapper;
import org.example.pojo.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> list() {
        return usersMapper.selectAll();
    }
}

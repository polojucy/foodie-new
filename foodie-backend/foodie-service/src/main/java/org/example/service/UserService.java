package org.example.service;

import org.example.pojo.Users;

import java.util.List;

public interface UserService {
    /**
     * 获取用户列表
     * @return
     */
    List<Users> list();
}

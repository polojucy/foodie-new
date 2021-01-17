package com.foodie.api.controller;

import com.foodie.pojo.Users;
import com.foodie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UsersService userService;

    @GetMapping("/users")
    public List<Users> usersList() {
        return userService.list();
    }

}

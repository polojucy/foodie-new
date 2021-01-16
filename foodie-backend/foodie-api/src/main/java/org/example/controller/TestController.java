package org.example.controller;

import org.example.pojo.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Users> usersList() {
        return userService.list();
    }

}

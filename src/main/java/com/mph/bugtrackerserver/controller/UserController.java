package com.mph.bugtrackerserver.controller;

import com.mph.bugtrackerserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    @Autowired
    private UserService userService;
}

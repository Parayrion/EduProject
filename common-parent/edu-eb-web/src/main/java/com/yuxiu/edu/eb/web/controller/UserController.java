package com.yuxiu.edu.eb.web.controller;

import com.yuxiu.edu.eb.service.IUserService;
import com.yuxiu.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("find")
    public void find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
    }
}

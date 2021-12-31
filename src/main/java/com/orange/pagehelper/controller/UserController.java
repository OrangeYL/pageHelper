package com.orange.pagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.orange.pagehelper.entity.User;
import com.orange.pagehelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listAllUser(Model model,
                              @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum,
                              @RequestParam(defaultValue = "5",value = "pageSize") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userService.listAllUser();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        model.addAttribute("userPageInfo",userPageInfo);
        return "index";
    }
}

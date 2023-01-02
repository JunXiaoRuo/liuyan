package com.junruo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: JunRuo
 * @Date: 14:42 2022/7/21
 * @Description:
 * @Version v1.0
 */
@Controller
public class LoginController {

    @GetMapping("/myLogin")
    public String login(){
        System.out.println("登录");
        return "login.html";
    }

    @PostMapping("/doLogin")
    public void doLogin(){

    }
}

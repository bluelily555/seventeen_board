package com.seventeen.demo.controller;

import com.seventeen.demo.domain.User;
import com.seventeen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //c
    @GetMapping("/user/joinForm")
    public String userJoinForm(){
        return "userJoinForm";
    }

    @PostMapping("/user/join")
    public String userJoin(User user){
        userService.userJoin(user);
        return "redirect:/user/loginForm";
    }

    //r
    @GetMapping("/user/loginForm")
    public String userLoginFrom(){
        return "userLoginForm";
    }

    @PostMapping("/user/login")
    public String userLogin(Model model, User user){
        if(userService.userLogin(user)){
            model.addAttribute("userId", user.getId());
            return "redirect:/board/list";
        } else {
            model.addAttribute("msg", "로그인에 실패하였습니다.");
            return "userLoginForm";
        }
    }
    //u
    //d
}

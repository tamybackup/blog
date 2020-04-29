package com.tamy.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class AdminController {
    // 在登陆成功后，通过 Principal 获取登录人信息，类似于session
    // @AuthenticationPrincipal 认证身份主体
    @RequestMapping("/admin")
    public String adminIndex(@AuthenticationPrincipal Principal principal, Model model){
        model.addAttribute("username",principal.getName());
        return "admin/index";
    }
}

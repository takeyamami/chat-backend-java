package com.chat.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String index(ModelMap modelMap) {
        return "login";
    }

    @PostMapping("/login/action")
    public String action(@RequestParam("email")String email,@RequestParam("password")String password) {
        if (email.equals("") || password.equals("")) {
            return "login";
        }

        return "redirect:/chat";
    }
}

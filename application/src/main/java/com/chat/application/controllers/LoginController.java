package com.chat.application.controllers;

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
    public String action(ModelMap modelMap) {


        return "chat";
    }
}

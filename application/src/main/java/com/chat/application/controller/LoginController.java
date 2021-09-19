package com.chat.application.controller;

import com.chat.application.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String index(@ModelAttribute Login login) {
        // ログイン情報があるかどうかで出し分けたい
        return "redirect:/login";
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute Login login) {
        return "login";
    }

    @PostMapping("/login")
    public String action(@Validated @ModelAttribute Login login, BindingResult result) {
        if (result.hasErrors()) {
            return "login";
        }

        return "redirect:/chat";
    }
}

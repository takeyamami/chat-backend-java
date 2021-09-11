package com.chat.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String index(ModelMap modelMap) {
        return "login";
    }

    @PostMapping("/login/action")
    public String action(@RequestParam("email")String email,@RequestParam("password")String password, HttpServletResponse response) {
        if (email.equals("") || password.equals("")) {
            return "login";
        }

        Cookie cookie = new Cookie("id", email);
        cookie.setMaxAge(24 * 60 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);

        return "redirect:/chat";
    }
}

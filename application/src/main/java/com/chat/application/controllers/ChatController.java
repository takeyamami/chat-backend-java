package com.chat.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CookieValue;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String chat(@CookieValue(value="id", required=false) String email, ModelMap modelMap) {
        modelMap.addAttribute("email", email);
        return "chat";
    }
}

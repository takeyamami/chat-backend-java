package com.chat.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String chat(ModelMap modelMap) {
//        modelMap.addAttribute("rid", rid);
        return "chat";
    }
}

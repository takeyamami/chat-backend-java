package com.chat.application.controller;

import com.chat.application.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    @RequestMapping("/chat")
    public String chat(Model model) {
        Room room = new Room(0, "");
        model.addAttribute("room", room);

        return "chat";
    }

    @RequestMapping("/chat/{rid}")
    public String chat(Model model, @PathVariable("rid") Integer rid) {
        // Modelsを実装して、ダミーリストを作って画面に表示
        Room room = new Room(rid, "てけてけ");
        model.addAttribute("room", room);

        return "chat";
    }

    @PostMapping("/chat/action")
    public String action(@RequestParam("rid")Integer rid,@RequestParam("message")String message,Model model) {
        Room room = new Room(rid, "てけてけ");
        model.addAttribute("room", room);

        return "redirect:/chat/" + rid;
    }
}

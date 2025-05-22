package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TwoController {

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username","베지터");
        return "goodbye";
    }
}
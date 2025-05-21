package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BayController {

    @GetMapping("/bye")
    public String seyGoodBay(Model model){
        model.addAttribute("nickname","유씨 구멍 활짝");
        return "goodbye";
    }
}

package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//REST API전용 컨트롤러
public class FirstApiController {
    @GetMapping("/api/hello")
    public String hello(){
        return "hello wared";
    }
}

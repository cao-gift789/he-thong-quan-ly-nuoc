package com.example.waterbill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToHome() {
        return "home"; 
    }
    
    @GetMapping("/home")
    public String home() {
        return "home"; // Trả về home.html
    }
}

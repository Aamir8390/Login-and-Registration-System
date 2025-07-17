package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @GetMapping("/req/signup")
    public String showSignup() {
        return "signup";
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }
}
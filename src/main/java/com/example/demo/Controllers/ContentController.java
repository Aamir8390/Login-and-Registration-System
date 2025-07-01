package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String showLogin() {
        return "login"; // Make sure this matches your template name
    }

    @GetMapping("/signup")
    public String showSignup() {
        return "signup"; // Make sure this matches your template name
    }

    @GetMapping("/home")
    public String showHome() {
        return "home"; // You'll need to create this template
    }
}
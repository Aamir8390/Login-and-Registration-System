package com.example.demo.Controllers;

import com.example.demo.Model.MyAppUser;
import com.example.demo.Model.MyAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Encoder;

@Controller
public class RegistrationController {
    @Autowired
    private MyAppUserRepository myAppUserRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/req/signup")
    public String createUser(@ModelAttribute MyAppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        myAppUserRepository.save(user);
        return "redirect:/login"; //  this will redirect to the login page after registration
    }

}

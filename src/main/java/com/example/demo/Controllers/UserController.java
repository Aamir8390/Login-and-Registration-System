package com.example.demo.Controllers;

import com.example.demo.Dto.UserDto;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping(path ="/save")
    public String SaveUser(@RequestBody UserDto userDto){
        String id = userService.addUser(userDto);
                return id;
    }
}

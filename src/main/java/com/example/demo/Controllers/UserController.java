package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping(path ="/save")
    public String SaveUser(
            @ResponseBody UserDto userDto
    ){
        String id = userService.addUser(UserDto);
                return id;
    }
}

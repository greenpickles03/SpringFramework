package com.springframework.Spring.Framework.controller;

import com.springframework.Spring.Framework.dto.UserDTO;
import com.springframework.Spring.Framework.model.User;
import com.springframework.Spring.Framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public Map<String, Object> saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/findByUsernameAndPassword")
    public List<User> findByUsernameAndPassword(@RequestBody UserDTO userDTO) {
        return userService.findByUsernameAndPassword(userDTO);
    }

}

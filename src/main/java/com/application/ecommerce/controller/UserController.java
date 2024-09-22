package com.application.ecommerce.controller;

import com.application.ecommerce.service.UserService;
import com.application.ecommerce.modals.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{user_id}")
    public User getUserById(@PathVariable Integer user_id){
        return userService.getUser(user_id);
    }

    @PostMapping("/add")
    public User addNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}

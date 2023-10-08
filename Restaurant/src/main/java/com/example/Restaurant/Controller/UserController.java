package com.example.Restaurant.Controller;

import com.example.Restaurant.model.User;
import com.example.Restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("AllUser")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }
}

package com.example.Restaurant.service;

import com.example.Restaurant.model.User;
import com.example.Restaurant.repo.IFoodRepo;
import com.example.Restaurant.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);
        return "user added";
    }

    public List<User> getAllUser() {
        return iUserRepo.findAll();
    }
}

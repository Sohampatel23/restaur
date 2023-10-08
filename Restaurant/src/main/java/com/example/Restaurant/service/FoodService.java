package com.example.Restaurant.service;

import com.example.Restaurant.repo.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    IFoodRepo iFoodRepo;
}

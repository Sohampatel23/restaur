package com.example.Restaurant.service;

import com.example.Restaurant.model.Order;
import com.example.Restaurant.repo.IFoodRepo;
import com.example.Restaurant.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String addOrder(Order order) {
        iOrderRepo.save(order);
        return "Order added";
    }

    public List<Order> getAllOrder() {
      return  iOrderRepo.findAll();
    }
}

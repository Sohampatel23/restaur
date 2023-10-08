package com.example.Restaurant.Controller;

import com.example.Restaurant.model.Order;
import com.example.Restaurant.model.User;
import com.example.Restaurant.service.OrderService;
import com.example.Restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String addOrder(@RequestBody Order order)
    {
        return orderService.addOrder(order);
    }

    @GetMapping("AllUser")
    public List<Order> getAllOrder()
    {
        return orderService.getAllOrder();
    }
}

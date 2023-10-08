package com.example.Restaurant.repo;

import com.example.Restaurant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}

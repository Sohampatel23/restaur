package com.example.Restaurant.repo;

import com.example.Restaurant.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {
}

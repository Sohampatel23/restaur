package com.example.Restaurant.repo;

import com.example.Restaurant.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}

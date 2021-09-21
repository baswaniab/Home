package com.example.demo.reposiotry;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findById(long Id);
}
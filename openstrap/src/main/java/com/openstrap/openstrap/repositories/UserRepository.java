package com.openstrap.openstrap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openstrap.openstrap.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {
User findByUsername(String username);
}

package com.openstrap.openstrap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openstrap.openstrap.models.Chicken;

public interface ChickenRepository extends JpaRepository<Chicken, Integer> {

}

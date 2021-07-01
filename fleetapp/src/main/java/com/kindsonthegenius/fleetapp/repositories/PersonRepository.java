package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetapp.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}

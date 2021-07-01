package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetapp.models.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}

package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetapp.models.VehicleMaintainance;

public interface VehicleMaintainanceRepository extends JpaRepository<VehicleMaintainance, Integer> {

}

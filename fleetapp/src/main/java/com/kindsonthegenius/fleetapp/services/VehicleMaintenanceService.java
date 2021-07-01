package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.VehicleMaintainance;
import com.kindsonthegenius.fleetapp.repositories.VehicleMaintainanceRepository;


@Service
public class VehicleMaintenanceService {
	@Autowired
	private VehicleMaintainanceRepository  vehicleMaintenanceRepository;
	//return list of countries
 public List<VehicleMaintainance> getVehicleMaintenances(){
	 return vehicleMaintenanceRepository.findAll();
	 }

  //save the country
 public void save(VehicleMaintainance vehicleMaintenance) {
	 vehicleMaintenanceRepository.save(vehicleMaintenance);
 }
 
 //get by id
 public Optional<VehicleMaintainance> findById(int id) {
	 return vehicleMaintenanceRepository.findById(id);
	 
 }

public void delete(Integer id) {
	vehicleMaintenanceRepository.deleteById(id);
	
}


}

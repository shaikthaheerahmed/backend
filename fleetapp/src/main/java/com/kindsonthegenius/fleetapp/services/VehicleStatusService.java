package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.VehicleStatus;
import com.kindsonthegenius.fleetapp.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	private VehicleStatusRepository  vehiclestatusRepository;
	//return list of countries
 

  //save the country
 public void save(VehicleStatus vehiclestatus) {
	 vehiclestatusRepository.save(vehiclestatus);
 }
 
 //get by id
 public Optional<VehicleStatus> findById(int id) {
	 return vehiclestatusRepository.findById(id);
	 
 }

public void delete(Integer id) {
	vehiclestatusRepository.deleteById(id);
	
}

public List<VehicleStatus> getVehicleStatuss() {
	
	return vehiclestatusRepository.findAll();
}
}

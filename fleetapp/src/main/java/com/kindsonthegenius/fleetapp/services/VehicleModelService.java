package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.VehicleModel;
import com.kindsonthegenius.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	private VehicleModelRepository  vehicleModelRepository;
	//return list of countries
 

  //save the country
 public void save(VehicleModel vehicleModel) {
	 vehicleModelRepository.save(vehicleModel);
 }
 
 //get by id
 public Optional<VehicleModel> findById(int id) {
	 return vehicleModelRepository.findById(id);
	 
 }

public void delete(Integer id) {
	vehicleModelRepository.deleteById(id);
	
}

public List<VehicleModel> getVehicleModels() {
	
	return vehicleModelRepository.findAll();
}
}

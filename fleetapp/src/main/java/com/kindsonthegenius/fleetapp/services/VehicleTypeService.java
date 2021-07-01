package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.VehicleType;
import com.kindsonthegenius.fleetapp.repositories.VehicleTypeRepository;
@Service
public class VehicleTypeService {
	@Autowired
	private VehicleTypeRepository  vehicleTypesRepository;
	//return list of countries
 

  //save the country
 public void save(VehicleType vehicleTypes) {
	 vehicleTypesRepository.save(vehicleTypes);
 }
 
 //get by id
 public Optional<VehicleType> findById(int id) {
	 return vehicleTypesRepository.findById(id);
	 
 }

public void delete(Integer id) {
	vehicleTypesRepository.deleteById(id);
	
}

public List<VehicleType> getVehicleTypess() {
	
	return vehicleTypesRepository.findAll();
}
}

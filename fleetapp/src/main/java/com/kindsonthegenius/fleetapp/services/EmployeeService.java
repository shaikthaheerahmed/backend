package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Employee;
import com.kindsonthegenius.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository  employeeRepository;
	//return list of countries
 public List<Employee> getEmployees(){
	 return employeeRepository.findAll();
	 }

  //save the country
 public void save(Employee employee) {
	 employeeRepository.save(employee);
 }
 
 //get by id
 public Optional<Employee> findById(int id) {
	 return employeeRepository.findById(id);
	 
 }

public void delete(Integer id) {
	employeeRepository.deleteById(id);
	
}

public Employee findByUsername(String un) {
	
	return employeeRepository.findByUsername(un);
}

}

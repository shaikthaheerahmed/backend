package com.kindsonthegenius.fleetapp.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.InvoiceStatus;
import com.kindsonthegenius.fleetapp.repositories.InvoiceStatusRepository;


@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository  clientRepository;
	//return list of countries
 public List<InvoiceStatus> getInvoiceStatuss(){
	 return clientRepository.findAll();
	 }

  //save the country
 public void save(InvoiceStatus client) {
	 clientRepository.save(client);
 }
 
 //get by id
 public Optional<InvoiceStatus> findById(int id) {
	 return clientRepository.findById(id);
	 
 }

public void delete(Integer id) {
	clientRepository.deleteById(id);
	
}


}

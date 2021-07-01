package com.openstrap.openstrap.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Travel;
import com.openstrap.openstrap.repositories.TravelRepository;

@Service
public class TravelService {
@Autowired
private TravelRepository travelRepository;
	public void save(Travel travel) {
		
		travelRepository.save(travel);
	}
	public List<Travel> getTravel() {
		return travelRepository.findAll();
	}
	public Optional<Travel> findById(int id) {
		return travelRepository.findById(id);
	}
	public void save1(Travel travel) {
	 travelRepository.save(travel);
		
	}
	
	public void delete(Integer id) {
		travelRepository.deleteById(id);
		
	}


}

package com.openstrap.openstrap.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Chicken;
import com.openstrap.openstrap.repositories.ChickenRepository;

@Service
public class ChickenService {
@Autowired
private ChickenRepository chickenRepository;
	public List<Chicken> getchicken() {
		return chickenRepository.findAll();
	}

	public void save(Chicken chicken) {
		chickenRepository.save(chicken);
		
	}

	public Optional<Chicken> findById(int id) {
		return chickenRepository.findById(id);
	}

	public void update(Chicken chickens) {
		chickenRepository.save(chickens);
		
	}

	public void delete(Integer id) {
		chickenRepository.deleteById(id);
		
	}

	public void save1(Chicken chicken) {
		chickenRepository.save(chicken);
	}


}

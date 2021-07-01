package com.openstrap.openstrap.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Panner;
import com.openstrap.openstrap.repositories.PannerRepository;

@Service
public class PannerService {
@Autowired
private PannerRepository pannerRepository;
	public List<Panner> getPanner() {
		return pannerRepository.findAll();
	}
	public void save(Panner panner) {
		pannerRepository.save(panner);
		
	}
	public Optional<Panner> findById(int id) {
		return pannerRepository.findById(id);
	}
	public void update(Panner panner) {
		pannerRepository.save(panner);
		
	}
	public void delete(Integer id) {
		pannerRepository.deleteById(id);
		
		
	}

}

package com.openstrap.openstrap.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.About;
import com.openstrap.openstrap.repositories.AboutRepository;

@Service
public class AboutService {
@Autowired
private AboutRepository aboutRepository;
	public void save(About about) {
		aboutRepository.save(about);
		
	}
	public Optional<About> findById(Integer id) {
		
		return aboutRepository.findById(id);
	}
	public List<About> getabout() {
		return aboutRepository.findAll();
	}

}

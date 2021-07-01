package com.openstrap.openstrap.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Saving;
import com.openstrap.openstrap.repositories.SavingRepository;

@Service
public class SavingService {
@Autowired
private SavingRepository savingRepository;
	public void save(Saving saving) {
		savingRepository.save(saving);
		
	}

}

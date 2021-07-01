package com.openstrap.openstrap.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Profit;
import com.openstrap.openstrap.repositories.ProfitRepository;

@Service
public class ProfitService {
@Autowired
private ProfitRepository profitRepository;
	public void save(Profit profit) {
	profitRepository.save(profit);
		
	}

}

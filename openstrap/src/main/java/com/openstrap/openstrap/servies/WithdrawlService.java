package com.openstrap.openstrap.servies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Withdrawl;
import com.openstrap.openstrap.repositories.WithdrawlRepository;

@Service
public class WithdrawlService {
@Autowired
private WithdrawlRepository withdrawalrepository;
	public void save(Withdrawl withdrawl) {
		withdrawalrepository.save(withdrawl);
		
	}
	public Optional<Withdrawl> findById(int id) {
		
		return withdrawalrepository.findById(id);
	}

}

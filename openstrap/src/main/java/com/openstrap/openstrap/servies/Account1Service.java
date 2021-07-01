package com.openstrap.openstrap.servies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Account1;
import com.openstrap.openstrap.repositories.Account1Repository;

@Service
public class Account1Service {
@Autowired
private Account1Repository accountRepository;
	public void save(Account1 account) {
    accountRepository.save(account);
		
	}
	public Optional<Account1> findById(int id) {
		return accountRepository.findById(id);
	}

}

package com.openstrap.openstrap.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.Profile1;
import com.openstrap.openstrap.repositories.Profile1Repository;

@Service
public class Profile1Service {
@Autowired
private Profile1Repository profileRProfile1Repository;
	public void save(Profile1 profile1) {
	 profileRProfile1Repository.save(profile1);	
		
	}

}

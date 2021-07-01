package com.kindsonthegenius.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.User;
import com.kindsonthegenius.fleetapp.repositories.UserRepository;
@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired UserRepository userRepositoty;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepositoty.findByUsername(username);
	  if(user==null) {
		  throw new UsernameNotFoundException("user not found!");
	  }
	  
		return new UserPrincipal(user);
	  
	}

}

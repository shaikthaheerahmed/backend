package com.openstrap.openstrap.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.openstrap.openstrap.models.User;
import com.openstrap.openstrap.models.UserPrincipal;
import com.openstrap.openstrap.repositories.UserRepository;
 @Service
public class MyuserDetailsService implements UserDetailsService {
@Autowired UserRepository  userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("user Not Found");
		}
		return new UserPrincipal(user);
	}

}

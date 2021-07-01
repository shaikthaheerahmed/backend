package com.openstrap.openstrap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.openstrap.openstrap.models.Profile1;
import com.openstrap.openstrap.servies.Profile1Service;

@Controller
public class Profile1Controller {
	@Autowired
	private Profile1Service profileservices;
@GetMapping("/profile/profile")
public String profile(Model model) {
	//model.addAttribute("profile1", new profile1());
	return "profile1";
}
@PostMapping("/profile/profile")
public String save(Profile1 profile1) {
	profileservices.save(profile1);
	return "rediect:/profile/profile";	
}
}

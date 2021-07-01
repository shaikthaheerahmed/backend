package com.kindsonthegenius.fleetapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.kindsonthegenius.fleetapp.models.User;
import com.kindsonthegenius.fleetapp.services.UserService;


@Controller
public class UserController {
@Autowired
private UserService userService;
@GetMapping(value="/users")
public String getCountries() {
	return "User";
	
}
@PostMapping(value="users/addNew")
public RedirectView addNew(User user,RedirectAttributes redir) {
	userService.save(user);
	RedirectView redirectView=new RedirectView("/login",true);
	redir.addFlashAttribute("message","You are Successfully registered! now you can login");
	return redirectView;
}



}

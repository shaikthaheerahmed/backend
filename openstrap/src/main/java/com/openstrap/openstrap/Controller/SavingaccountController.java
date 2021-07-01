package com.openstrap.openstrap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.openstrap.openstrap.models.Saving;

import com.openstrap.openstrap.servies.SavingService;

@Controller
public class SavingaccountController {
	@Autowired
	private SavingService savingservice;
	
@GetMapping("/savingaccount")
public String getAccount(Model model) {
  model.addAttribute("saving", new Saving());
  return "savingaccount";
}
@PostMapping("/savingaccount")
	public String register(Saving saving) {
	savingservice.save(saving);
	return "success";
		
	}
}


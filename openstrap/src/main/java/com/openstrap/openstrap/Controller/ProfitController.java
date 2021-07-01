package com.openstrap.openstrap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.openstrap.openstrap.models.Profit;
import com.openstrap.openstrap.servies.ProfitService;

@Controller
public class ProfitController {
	@Autowired
	private ProfitService profitservice;
@GetMapping("/profit")
public String profit(Model model) {
model.addAttribute("profit", new Profit());
return "profit";
}
@PostMapping("/profit")
public String register(Profit profit) {
	profitservice.save(profit);
	return "success";
}
}
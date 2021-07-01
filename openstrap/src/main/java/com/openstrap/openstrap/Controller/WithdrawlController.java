package com.openstrap.openstrap.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.openstrap.openstrap.models.Withdrawl;
import com.openstrap.openstrap.servies.WithdrawlService;

@Controller
public class WithdrawlController {
	@Autowired
	private WithdrawlService withdrawlservice;
@GetMapping("/withdrawl")
public String getWithdrawl(Model model) {
model.addAttribute("withdrawl", new Withdrawl());
return "withdrawl";
}
@PostMapping("/withdrawl")
public String register(Withdrawl withdrawl) {
	withdrawlservice.save(withdrawl);
	return "success";
			
}

@RequestMapping("/withdrwal/findById")
@ResponseBody
public Optional<Withdrawl> findByid(int id) {
	return withdrawlservice.findById(id);
	
}
}

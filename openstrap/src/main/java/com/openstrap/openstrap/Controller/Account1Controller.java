package com.openstrap.openstrap.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.openstrap.openstrap.models.Account1;
import com.openstrap.openstrap.servies.Account1Service;



@Controller
public class Account1Controller {
@Autowired
private Account1Service accountservice;
@GetMapping("/account1")
public String getAccount(Model model) {
model.addAttribute("Account1", new Account1());
return "account1";
}

@PostMapping("/account1")
public String Register(Account1 account) {
	accountservice.save(account);
	return "success";
}


}




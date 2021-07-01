package com.openstrap.openstrap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountsController {
	
@GetMapping(value="/account")
public String goAccounts() {
	return "account";
}

}

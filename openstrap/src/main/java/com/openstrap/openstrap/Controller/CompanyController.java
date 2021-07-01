package com.openstrap.openstrap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {
@GetMapping("/about/company")
public String company() {
	return "company";
}
}

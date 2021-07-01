package com.openstrap.openstrap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {
@GetMapping("people")
public String people() {
	return "people";
}

}

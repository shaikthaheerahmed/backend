package com.openstrap.openstrap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LocationController {
@GetMapping("/Location")
public String Location() {
	return "location";
}
}

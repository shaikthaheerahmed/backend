package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleDataController {
@GetMapping("/vehicledata")
public String getdata() {
	return "/vehicledata";
}
}

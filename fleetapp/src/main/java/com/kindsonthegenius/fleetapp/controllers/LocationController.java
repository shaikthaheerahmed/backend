package com.kindsonthegenius.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.models.Location;
import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.services.CountryService;
import com.kindsonthegenius.fleetapp.services.LocationService;
import com.kindsonthegenius.fleetapp.services.StateService;

@Controller
public class LocationController {
	
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	@Autowired private LocationService locationService;
	
	@GetMapping("/locations")
	public String getLocations(Model model) {
		List<Location> locationlist=locationService.getLocations();
		model.addAttribute("locations", locationlist);
		
		List<State> statelist=stateService.getStates();
		model.addAttribute("states", statelist);
		
		List<Country> countrylist=countryService.getCountries();
		model.addAttribute("countries", countrylist);
		
		
		
		
		return "location";
	}
	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findByid(int id) {
		return locationService.findById(id);
		
	}
	@RequestMapping(value="/locations/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	@RequestMapping(value="/locations/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}
}

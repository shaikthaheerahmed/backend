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
import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.models.Supplier;
import com.kindsonthegenius.fleetapp.services.CountryService;
import com.kindsonthegenius.fleetapp.services.StateService;
import com.kindsonthegenius.fleetapp.services.SupplierService;

@Controller
public class SupplierController {
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	@Autowired private SupplierService supplierService;
	
	@GetMapping("/suppliers")
	public String getLocations(Model model) {
		List<Supplier> supplierlist=supplierService.getSuppliers();
		model.addAttribute("suppliers", supplierlist);
		
		List<State> statelist=stateService.getStates();
		model.addAttribute("states", statelist);
		
		List<Country> countrylist=countryService.getCountries();
		model.addAttribute("countries", countrylist);
		
		
		
		
		return "supplier";
	}
	@PostMapping("/suppliers/addNew")
	public String addNew(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}
	
	@RequestMapping("/suppliers/findById")
	@ResponseBody
	public Optional<Supplier> findByid(int id) {
		return supplierService.findById(id);
		
	}
	@RequestMapping(value="/suppliers/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}
	@RequestMapping(value="/suppliers/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		supplierService.delete(id);
		return "redirect:/suppliers";
	}
}

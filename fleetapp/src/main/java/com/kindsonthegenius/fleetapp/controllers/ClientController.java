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

import com.kindsonthegenius.fleetapp.models.Client;
import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.models.State;
import com.kindsonthegenius.fleetapp.services.ClientService;
import com.kindsonthegenius.fleetapp.services.CountryService;
import com.kindsonthegenius.fleetapp.services.StateService;

@Controller
public class ClientController {
	@Autowired private ClientService clientService;
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	
	@GetMapping("/clients")
	public String getCountries(Model model) {
		List<Client> clientlist=clientService.getClients();
		model.addAttribute("clients", clientlist);
		
		List<State> statelist=stateService.getStates();
		model.addAttribute("states", statelist);
		
		List<Country> countrylist=countryService.getCountries();
		model.addAttribute("countries", countrylist);
		
		
		
		
		return "client";
	}
	@PostMapping("/clients/addNew")
	public String addNew(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	
	@RequestMapping("/clients/findById")
	@ResponseBody
	public Optional<Client> findByid(int id) {
		return clientService.findById(id);
		
	}
	@RequestMapping(value="/clients/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/states";
	}
	@RequestMapping(value="/clients/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/states";
	}
	
}

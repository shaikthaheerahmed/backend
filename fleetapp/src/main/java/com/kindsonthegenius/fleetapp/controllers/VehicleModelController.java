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

import com.kindsonthegenius.fleetapp.models.VehicleModel;

import com.kindsonthegenius.fleetapp.services.VehicleModelService;

@Controller
public class VehicleModelController {
@Autowired private VehicleModelService vehicleModelService;
	
	@GetMapping("/vehicleModels")
	public String getVehicleModels(Model model) {
		List<VehicleModel> vehicleModellist=vehicleModelService.getVehicleModels();
		model.addAttribute("vehicleModels", vehicleModellist);
		
		return "vehiclemodal";
	}
	@PostMapping("/vehicleModels/addNew")
	public String addNew(VehicleModel vehicleModels) {
		vehicleModelService.save(vehicleModels);
		return "redirect:/vehicleModels";
	}
	
	@RequestMapping("/vehicleModels/findById")
	@ResponseBody
	public Optional<VehicleModel> findByid(int id) {
		return vehicleModelService.findById(id);
		
	}
	@RequestMapping(value="/vehicleModels/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleModel vehicleModels) {
		vehicleModelService.save(vehicleModels);
		return "redirect:/vehicleModels";
	}
	@RequestMapping(value="/vehicleModels/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehicleModelService.delete(id);
		return "redirect:/vehicleModels";
	}
}

package com.openstrap.openstrap.Controller;

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

import com.openstrap.openstrap.servies.TravelService;
import com.openstrap.openstrap.models.Travel;
@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
@GetMapping("/travels")
public String Travel(Model model) {
	List<Travel> travel=travelService.getTravel();
	model.addAttribute("travels", travel);
	return "travel";
}
@PostMapping("/travels")
public String Travels(Travel travels) {
travelService.save(travels);
return "redirect:/travels";
}

@PostMapping("/travels/addNew")
public String addNew(Travel travels) {
	travelService.save1(travels);
	return "redirect:/travels";
}
@RequestMapping("/travels/findById")
@ResponseBody
public Optional<Travel> findByid(int id){
return travelService.findById(id);
}

@RequestMapping(value="/travels/update",method = {RequestMethod.PUT,RequestMethod.GET})
public String update(Travel travels) {
	travelService.save(travels);
	return "redirect:/travels";
}
@RequestMapping(value="/travels/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
public String delete(Integer id) {
	travelService.delete(id);
	return "redirect:/travels";
	
}
}
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

import com.openstrap.openstrap.models.Chicken;
import com.openstrap.openstrap.servies.ChickenService;

@Controller
public class ChickenController {
	@Autowired private ChickenService chickenservice;
@GetMapping("/chickens")
public String chicken(Model model) {
	List<Chicken> chicken=chickenservice.getchicken();
	model.addAttribute("chickens", chicken);
	return "chicken";
}
@PostMapping("/chickens")
public String save(Chicken chickens) {
	chickenservice.save(chickens);
	return "redirect:/chickens";
			}

@PostMapping("/chicken/addNew")
public String save1(Chicken chickens) {
	chickenservice.save(chickens);
	return "redirect:/chickens";
			}
@RequestMapping("/chickens/findById")
@ResponseBody
public Optional<Chicken> findById(int id){
	return chickenservice.findById(id);
}
@RequestMapping(value="/chickens/update",method= {RequestMethod.PUT,RequestMethod.GET})
public String update(Chicken chicken) {
	chickenservice.save(chicken);
	return "redirect:/chickens";
}
@RequestMapping(value="/chickens/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
public String delete(Integer id) {
	chickenservice.delete(id);
	return "redirect:/chickens";
}
}

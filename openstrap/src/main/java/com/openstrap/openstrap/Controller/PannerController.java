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

import com.openstrap.openstrap.models.Panner;
import com.openstrap.openstrap.servies.PannerService;

@Controller
public class PannerController {
	@Autowired
	private PannerService pannerService;
@GetMapping("/panner")
public String panner(Model model) {
	List<Panner> pannerlist=pannerService.getPanner();
	model.addAttribute("panners", pannerlist);
	return "panner";
}
@PostMapping("/panner/addNew")
public String addNew(Panner panner) {
	pannerService.save(panner);
	return "redirect:/panner";	
}
@RequestMapping("/panner/findById")
@ResponseBody
public Optional<Panner> findById(int id){
	return pannerService.findById(id);
}
@RequestMapping(value="/panner/update",method = {RequestMethod.PUT,RequestMethod.GET})
public String Update(Panner panner) {
	pannerService.update(panner);
	return "redirect:/panner";
}
@RequestMapping(value="/panner/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
public String delete(Integer id) {
	pannerService.delete(id);
	return "redirect:/panner";
}
}

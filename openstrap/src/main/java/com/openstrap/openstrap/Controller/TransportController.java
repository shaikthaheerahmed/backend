package com.openstrap.openstrap.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openstrap.openstrap.models.Transport;
import com.openstrap.openstrap.servies.TransportService;

@Controller
public class TransportController {
	@Autowired
	private TransportService transportService;
@GetMapping("/transport")
public String Transport(Model model) {
	List<Transport> transportlist=transportService.getTransport();
	model.addAttribute("transports",transportlist);
	return "transport";
}
@PostMapping("/transport")
public String save(Transport transport) {
	transportService.save(transport);
	return "redirect:/transport";
}
@PostMapping("/transport/addNew")
public String save1(Transport transport) {
	transportService.save(transport);
	return "redirect:/transport";
}
@RequestMapping("/transport/findById")
@ResponseBody
public Optional<Transport> findById(int id){
	return transportService.findById(id);
}
}

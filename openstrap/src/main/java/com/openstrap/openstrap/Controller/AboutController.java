package com.openstrap.openstrap.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.openstrap.openstrap.models.About;
import com.openstrap.openstrap.servies.AboutService;

@Controller
public class AboutController {
	@Autowired
	private AboutService aboutservice;
@GetMapping("/about")
public String about(Model model) {
	model.addAttribute("About", new About());
	return "about";
	
}
@PostMapping("/about")
public String register(About about) {
	aboutservice.save(about);
	return "success";
	
}
@RequestMapping("/about/findById") 
@ResponseBody
public Optional<About> findById(Integer id)
{
	return aboutservice.findById(id);
}
}

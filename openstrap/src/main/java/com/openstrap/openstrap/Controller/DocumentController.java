package com.openstrap.openstrap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentController {
@GetMapping("/document")
public String Document() {
	return "document";
}
}
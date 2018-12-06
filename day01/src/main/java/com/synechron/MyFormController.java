package com.synechron;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFormController {

	@PostMapping("/process")
	public String processName(@RequestParam String name, HttpSession session) {
		String message = "Hello " + name;
		session.setAttribute("message", message);
		return "result";
	}
	
	@GetMapping("/begin")
	public String begin() {
		return "index";
	}
}

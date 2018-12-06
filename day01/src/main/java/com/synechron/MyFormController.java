package com.synechron;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyFormController {

	@GetMapping("/begin")
	public String begin() {
		return "index";
	}
}

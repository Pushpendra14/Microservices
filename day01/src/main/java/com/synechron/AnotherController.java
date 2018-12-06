package com.synechron;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	//http://localhost:8080/temperature?city=Pune
	@GetMapping("/temperature")
	public String getTemperature(@RequestParam("city") String city) {
		return "Temperature of " + city + " id " + Math.random() * 100;
	}
}

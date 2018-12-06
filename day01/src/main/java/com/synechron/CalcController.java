package com.synechron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private Calculator calculator;
	
	@GetMapping("/square/{num}")
	public int square(@PathVariable int num) {
		return calculator.square(num);
	}
	
	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return calculator.add(num1, num2);
	}
	
	@PutMapping("/subtract/{num1}/{num2}")
	public int subtract(@PathVariable int num1, @PathVariable int num2) {
		return calculator.subtract(num1, num2);
	}
	
	@PostMapping("/product/{num1}/{num2}")
	public int product(@PathVariable int num1, @PathVariable int num2) {
		return calculator.product(num1, num2);
	}
	 
}

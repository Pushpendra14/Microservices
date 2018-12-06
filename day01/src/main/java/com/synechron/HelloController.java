package com.synechron;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/hello/Sam

@RestController
public class HelloController {

	//curl -XPOST 'http://localhost:8080/bye/Ram'
	
	@PostMapping("/bye/{name}")
	public String bye(@PathVariable("name") String name) {
		return  "Bye Bye " + name;
	}
	
	@GetMapping("/hello/{name}")
	public String greet(@PathVariable("name")  String name) {
		return "Hello " + name;
	}
}

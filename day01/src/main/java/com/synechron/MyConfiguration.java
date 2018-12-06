package com.synechron;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean
	public List<String> menu() {
		return Arrays.asList("Roti", "Rice", "Combo");
	}
}











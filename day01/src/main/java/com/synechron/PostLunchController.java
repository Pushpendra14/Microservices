package com.synechron;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostLunchController {

	@Autowired
	private List<String> menu;
	
	@PostMapping("/registerhotel")
	public String printHotelInformation(@RequestBody HotelInformation hotelInformation) {
		return hotelInformation.getName() + " registered";
	}
	
	@GetMapping("/hotel")
	public HotelInformation getHotelInformation() {
		HotelInformation hotelInformation = new HotelInformation();
		hotelInformation.setName("Kothas Coffee");
		hotelInformation.setCity("Bangalore");
		hotelInformation.setBranches(Arrays.asList("Richmond", "E City", "Whitefield"));
		return hotelInformation;
	}
	
	@GetMapping("/menu")
	public List<String> getMenu() {
		return menu;
	}
}








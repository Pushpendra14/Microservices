package com.synechron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class UIController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${palindrome.service.base_url}")
	private String palindromeServiceBaseUrl;
	
	@GetMapping("/")
	public String start() {
		return "index";
	}
	
	@PostMapping("/check")
	public String checkPalindrome(@RequestParam String word, Model model) {
		String url = palindromeServiceBaseUrl + "/" + word;
		ResponseEntity<Boolean> responseEntity =
				restTemplate.postForEntity(url, null, Boolean.class);
		boolean isPalin = responseEntity.getBody();
		String message = word + (isPalin? " is" : " is not") + " a palindrome";
		model.addAttribute("message", message);
		return "index";
	}
}







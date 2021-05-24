package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/Bingo")
	public String Bingo() {
		return "You have just begun";
	}
}

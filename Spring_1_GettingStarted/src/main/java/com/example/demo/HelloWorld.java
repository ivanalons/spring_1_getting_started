package com.example.demo;

import java.util.HashMap;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
public class HelloWorld {

	//	@GetMapping("/")
	//	public String greet() {
	//		return "HELLO WORLD";
	//	}
	
	@GetMapping("/")
	public HashMap<String,String> greet(@RequestParam(name="nom", required=false) String nom) {
		
		if(nom==null) nom="WORLD";
		
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "HELLO , " + nom);

		return map;		
	}

}
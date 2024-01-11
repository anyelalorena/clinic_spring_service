package com.alom.clinic_spring_service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;


@Controller
public class GreetingController {
	
	@RequestMapping("/")
	public String greeting() {
		//model.addAtribute("name", "World"));
		return "index";
	}
	
}

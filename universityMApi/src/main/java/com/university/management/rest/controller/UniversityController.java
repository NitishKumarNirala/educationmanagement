package com.university.management.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.management.constant.CommonConstant;

@CrossOrigin
@RestController(CommonConstant.API_URL_BASE)
public class UniversityController {
	
	
	@GetMapping("/")
	public String getLink() {
		return "Start  Application";
	}

}

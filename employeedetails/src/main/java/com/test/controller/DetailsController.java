package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.DetailsEntity;

@RestController
public class DetailsController {
	
	@PostMapping("/register")
	public String empDetails(@ModelAttribute DetailsEntity d) {
		System.out.println(d);
		return "EmpPage.html";
		
	}

}

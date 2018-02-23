package com.sv.pghms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
		
	@RequestMapping("/")
	public String home(){
		//System.out.println("This is from HomeController.");
		return "redirect:/auth/login";
	}
}
package com.sv.pghms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/auth")
public class LoginLogoutController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginPage(@RequestParam(value="error_msg", required=false) String error, Model model){
		//System.out.println("Error Message: " + error);
		//System.out.println("Entered LoginLogout Controller");
		if (error!=null) {
			model.addAttribute("error", "Wrong User Name or Password!");
		} else {
			model.addAttribute("error", "");
		}
		
		return "Login";			
	}
	
	@RequestMapping(value = "/denied", method = RequestMethod.GET)
 	public String getDeniedPage() {
		return "redirect:/auth/login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
 	public String logout() {
		
		return "redirect:/auth/login";
	}

}

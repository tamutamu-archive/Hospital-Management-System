package com.sv.pghms.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.sv.pghms.model.TUser;
import com.sv.pghms.service.AdminService;

@Controller
@RequestMapping("/main")
public class AdminController {
	
	/*@Autowired
	private AdminService adminService;*/

	@RequestMapping(value="/userForm",method=RequestMethod.GET)
	public ModelAndView UserForm() {
		
		ModelAndView model = new ModelAndView("UserCreationPage");
		
		TUser user = new TUser();
		List<TUser> userList = new ArrayList<TUser>();
		try {
			
			//userList = adminService.viewUser();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		model.addObject("user",user);
		model.addObject("userList", userList);
		
		return model;
	}

	/*@RequestMapping(value="/userForm", method=RequestMethod.POST)
	public String InsertUser(@ModelAttribute("user") TUser user){
		
		try{
			
			adminService.insertUser(user);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return "redirect:/main/userForm";
	}*/
	@RequestMapping(value="/resetPassword",method=RequestMethod.GET)
	public String PasswordResetPage() {
		
		return "PasswordResetPage";
	}
	
}
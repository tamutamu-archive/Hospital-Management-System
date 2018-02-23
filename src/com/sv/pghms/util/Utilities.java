package com.sv.pghms.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.sv.pghms.model.TUser;
import com.sv.pghms.service.UserService;

public class Utilities {

	@Autowired
	private UserService userService;

	public static String getCurrentLoginID(){
		String loginID = null;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		loginID = auth.getName();
		return loginID;
	}

	public String getFullName(){
		
		TUser user = userService.getUserByLoginID(getCurrentLoginID());
		//System.out.println("User from Utilities: "+user.getUserFullName());
		String fullName = user.getUserFullName();
		return fullName;
	}
	

	public String getLoginRole(){
		
		TUser user = userService.getUserByLoginID(getCurrentLoginID());
		//System.out.println("User Role: "+user.getUserRole());
		String userRole = user.getUserRole();

		return userRole;
	}
	public String getCurrentPassword(){
		
		TUser user = userService.getUserByLoginID(getCurrentLoginID());
		String userPassword = user.getUserPassword();

		return userPassword;
	}
	public static String convertDateToString(Date date, String format){ 
		SimpleDateFormat formatter = new SimpleDateFormat(format); 
		return formatter.format(date); 
	}

	public static Date convertStringToDate(String date, String format) throws ParseException{ 
		SimpleDateFormat formatter = new SimpleDateFormat(format); 
		return formatter.parse(date); 
	}

	public static String getCurrentDate() {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
      	//System.out.println("Current Date: " + sdf.format(date));
		return sdf.format(date);
	}
	public static Timestamp getCurrentTimestamp(){
		
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		return  timestamp;
	}
	
}

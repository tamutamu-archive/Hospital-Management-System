package com.sv.pghms.service;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class LoginFailureHandlerService implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authentication)
			throws IOException, ServletException {
		
		
		//User user = userService.getUserByLoginID(authentication.getAuthentication().getName());
		//System.out.println("Login Failure Handler");
		
		response.sendRedirect("/PGHMS/auth/login?error_msg=" +authentication.getMessage());
		
		
	}
}

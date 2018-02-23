package com.sv.pghms.service;

import org.springframework.beans.factory.annotation.Autowired;

import  com.sv.pghms.dao.UserDao;
import  com.sv.pghms.model.TUser;


public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public TUser getUserByLoginID(String LoginID) {
		
		return userDao.getUserByLoginID(LoginID);
	}
	@Override
	public TUser getUserByEmployeeID(String EmployeeId) {
	
		return userDao.getUserByEmployeeID(EmployeeId);
	}

}

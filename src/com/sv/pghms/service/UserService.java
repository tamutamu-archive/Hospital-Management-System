package com.sv.pghms.service;

import  com.sv.pghms.model.TUser;

public interface UserService {

	public TUser getUserByLoginID(String LoginId);
	public TUser getUserByEmployeeID(String EmployeeId);
}

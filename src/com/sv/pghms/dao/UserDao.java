package com.sv.pghms.dao;

import  com.sv.pghms.model.TUser;

public interface UserDao {

	public TUser getUserByLoginID(String LoginID);
	public TUser getUserByEmployeeID(String EmployeeId);
}

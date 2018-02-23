package com.sv.pghms.dao;

import  com.sv.pghms.model.TUser;

public interface CustomUserDetailsDao {

	public TUser getUserByLoginID(String loginID);
}

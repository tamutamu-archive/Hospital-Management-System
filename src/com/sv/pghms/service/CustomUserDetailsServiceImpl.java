package com.sv.pghms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;






import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import  com.sv.pghms.dao.CustomUserDetailsDao;
import  com.sv.pghms.model.TUser;

import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("deprecation")
@Transactional(readOnly = true)
public class CustomUserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	CustomUserDetailsDao customUserDetailsDao;

	@Override
	public UserDetails loadUserByUsername(String loginID)
			throws UsernameNotFoundException {
		
		UserDetails user = null;		
		TUser dbUser = null;
		String password = null;
		boolean isEnable = false;

		try {
			dbUser = customUserDetailsDao.getUserByLoginID(loginID);
			System.out.println("loginID: "+loginID);
			System.out.println("test111");
			if (dbUser != null) {
				System.out.println("test222");
				password = dbUser.getUserPassword();
				System.out.println("password: "+password);
				isEnable = dbUser.isUserStatus();
				System.out.println("isEnable: "+isEnable);
			} else {
				return null;
			}
			System.out.println("test555");
			user = new org.springframework.security.core.userdetails.User(
					dbUser.getUserLoginId(),
					password, 
					isEnable, 
					true, 
					true, 
					true, 
					getAuthorities(dbUser.getUserRole()));
			System.out.println("dbUser.getUserLoginId(): "+dbUser.getUserLoginId());

		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("Error in retrieving user");
		}
		return user;
	}

	public Collection<GrantedAuthority> getAuthorities(String access){

		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		//System.out.println("acces: "+access);
		//authList.add(new GrantedAuthorityImpl("ROLE_EMPLOYEE"));
		
		if ( access.compareTo("Admin") == 0){
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		}
		return authList;

	}

}

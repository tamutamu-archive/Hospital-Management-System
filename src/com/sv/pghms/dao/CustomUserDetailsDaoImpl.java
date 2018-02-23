package com.sv.pghms.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import  com.sv.pghms.model.TUser;

public class CustomUserDetailsDaoImpl implements CustomUserDetailsDao{

	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction tx;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public TUser getUserByLoginID(String loginID) {
		
		//System.out.println("Login ID: "+loginID);
		session = sessionFactory.openSession();
		TUser user = new TUser();
		try{
			
			tx = session.beginTransaction();
			user = (TUser) session.get(TUser.class,loginID);
			tx.commit();	
		}
		catch(Exception e){
			
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			
			session.flush();
			session.clear();
			session.close();
		}
		return user;
	}

}

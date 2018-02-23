package com.sv.pghms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import  com.sv.pghms.model.TUser;

@Repository
public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction tx;

	//@Required
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public TUser getUserByLoginID(String LoginID) {
		
		session = sessionFactory.openSession();
		TUser user = new TUser();
		try{
			
			tx = session.beginTransaction(); 
			user = (TUser) session.get(TUser.class,LoginID);
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

	@Override
	public TUser getUserByEmployeeID(String EmployeeId) {
		session = sessionFactory.openSession();
		TUser user = new TUser();
		try{
			
			tx = session.beginTransaction(); 
			user = (TUser) session.get(TUser.class,EmployeeId);
			tx.commit();	
		}
		catch(Exception e){
			
			e.printStackTrace();
			tx.rollback();
		}
		finally{
			
			session.clear();
			session.flush();
			session.close();
		}
		return user;
	}

}

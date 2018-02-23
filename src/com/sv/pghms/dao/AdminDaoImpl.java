package com.sv.pghms.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sv.pghms.model.TUser;

public class AdminDaoImpl implements AdminDao{

	private SessionFactory sessionFactory;
	public Session session;
	public Transaction tx;
	
	/*@Override
	public boolean insertUser(TUser user) {
		boolean retVal = false;
		session = sessionFactory.openSession(); 
		try {
			tx = session.beginTransaction();
			session.save(user);
			retVal = true;
			session.getTransaction().commit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			retVal = false;
			session.getTransaction().rollback();
		}
		finally {
			
			session.flush();
			session.clear();
			session.close();
		}
		return retVal;
	}*/

}

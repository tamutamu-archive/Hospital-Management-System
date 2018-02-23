package com.sv.pghms.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import com.sv.pghms.model.TDailyAccountOfOperationSection;

@Repository
public class PharmacyDaoImpl implements PharmacyDao {

	private SessionFactory sessionFactory;
	public Session session;
	public Transaction tx;
	public String sql = "";
	Query query = null;
	
	@Required
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection) {
		
		boolean retVal = false;
		session = sessionFactory.openSession(); 
		try {
			tx = session.beginTransaction();
			session.save(dailyAccountOfOperationSection);
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
	}
	
	@Override
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		session = sessionFactory.openSession(); 
		List<TDailyAccountOfOperationSection> dailyAccountOfOperationSectionList = new ArrayList<TDailyAccountOfOperationSection>();
		try {
			
			tx = session.beginTransaction();
			dailyAccountOfOperationSectionList =  session.createQuery("from TDailyAccountOfOperationSection").list();
			session.getTransaction().commit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			session.getTransaction().rollback();			
		}
		finally {
			
			session.clear();
			session.flush();
			session.close();			
		}
		return dailyAccountOfOperationSectionList;
	}
}

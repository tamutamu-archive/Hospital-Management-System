package com.sv.pghms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.pghms.dao.PathologyDao;
import com.sv.pghms.dao.PharmacyDao;
import com.sv.pghms.model.TDailyAccountOfOperationSection;

@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	private PharmacyDao pharmacyDao;
	
	@Override
	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pharmacyDao.insertInsertDailyAccountOfOperationSection(dailyAccountOfOperationSection);
	}

	@Override
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pharmacyDao.getDailyAccountOfOperationSectionList();
	}

}

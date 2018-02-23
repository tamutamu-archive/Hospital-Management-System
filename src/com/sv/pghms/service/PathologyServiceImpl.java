package com.sv.pghms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.pghms.dao.PathologyDao;
import com.sv.pghms.model.TDailyAccountOfOperationSection;

@Service
public class PathologyServiceImpl implements PathologyService {

	@Autowired
	private PathologyDao pathologyDao;
	
	/*@Override
	public boolean insert(TDailyAccountOfOperationSection dailyAccountOfOperationSection) {

		return pathologyDao.insert(dailyAccountOfOperationSection);
	}

	@Override
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList() {
		
		return pathologyDao.getDailyAccountOfOperationSectionList();
	}*/
}

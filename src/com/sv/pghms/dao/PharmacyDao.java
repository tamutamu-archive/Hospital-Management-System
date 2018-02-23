package com.sv.pghms.dao;

import java.util.List;

import com.sv.pghms.model.TDailyAccountOfOperationSection;

public interface PharmacyDao {

	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}

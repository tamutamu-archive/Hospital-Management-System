package com.sv.pghms.service;

import java.util.List;

import com.sv.pghms.model.TDailyAccountOfOperationSection;

public interface PharmacyService {

	public boolean insertInsertDailyAccountOfOperationSection(TDailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<TDailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}

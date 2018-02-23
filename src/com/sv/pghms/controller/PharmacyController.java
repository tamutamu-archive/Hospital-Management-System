package com.sv.pghms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sv.pghms.model.TDailyAccountOfOperationSection;
import com.sv.pghms.service.PharmacyService;

@Controller
@RequestMapping("/main")
public class PharmacyController {

	@Autowired
	private PharmacyService pharmacyService;
	
	@RequestMapping(value="/dailyAccountOfOperationSection", method=RequestMethod.GET)
	public String DailyAccountOfOperationSection(Model model){
		
		TDailyAccountOfOperationSection dailyAccountOfOperationSection = new TDailyAccountOfOperationSection();
		List<TDailyAccountOfOperationSection> dailyAccountOfOperationSectionList = new ArrayList<TDailyAccountOfOperationSection>();
		
		try{
			dailyAccountOfOperationSectionList = pharmacyService.getDailyAccountOfOperationSectionList();
		}catch(Exception e){
			e.printStackTrace();
		}
		model.addAttribute("dailyAccountOfOperationSection",dailyAccountOfOperationSection);
		model.addAttribute("dailyAccountOfOperationSectionList", dailyAccountOfOperationSectionList);
		
		return "DailyAccountOfOperationSection";
	}
	@RequestMapping(value="/dailyAccountOfOperationSection", method=RequestMethod.POST)
	public String InsertDailyAccountOfOperationSection(@ModelAttribute("dailyAccountOfOperationSection") TDailyAccountOfOperationSection dailyAccountOfOperationSection){
		
		try{
			
			pharmacyService.insertInsertDailyAccountOfOperationSection(dailyAccountOfOperationSection);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return "redirect:/main/dailyAccountOfOperationSection";
	}
	@RequestMapping(value="/dailyAccountOfPharmacy", method=RequestMethod.GET)
	public String DailyAccountOfPharmacy(Model model){
		
		return "DailyAccountOfPharmacy";
	}
	@RequestMapping(value="/dailyAccountOfPharmacy", method=RequestMethod.POST)
	public String InsertDailyAccountOfPharmacy(){
		
		return "redirect:/main/dailyAccountOfPharmacy";
	}
	@RequestMapping(value="/monthlyStatementOfOperationSectionPharmacy", method=RequestMethod.GET)
	public String MonthlyStatementOfOperationSection(Model model){
		
		return "MonthlyStatementOfOperationSectionPharmacy";
	}
	@RequestMapping(value="/monthlyStatementOfOperationSectionPharmacy", method=RequestMethod.POST)
	public String InsertMonthlyStatementOfOperationSection(){
		
		return "redirect:/main/monthlyStatementOfOperationSectionPharmacy";
	}
	@RequestMapping(value="/monthlyAccountOfPharmacy", method=RequestMethod.GET)
	public String MonthlyAccountOfPharmacy(Model model){
		
		return "MonthlyAccountOfPharmacy";
	}
	@RequestMapping(value="/monthlyAccountOfPharmacy", method=RequestMethod.POST)
	public String InsertMonthlyAccountOfPharmacy(){
		
		return "redirect:/main/monthlyAccountOfPharmacy";
	}
	@RequestMapping(value="/stockBalanceOfPharmacy", method=RequestMethod.GET)
	public String StockBalanceOfPharmacy(Model model){
		
		return "StockBalanceOfPharmacy";
	}
	@RequestMapping(value="/stockBalanceOfPharmacy", method=RequestMethod.POST)
	public String InsertStockBalanceOfPharmacy(){
		
		return "redirect:/main/stockBalanceOfPharmacy";
	}
	@RequestMapping(value="/statementOfCompany", method=RequestMethod.GET)
	public String StatementOfCompany(Model model){
		
		return "StatementOfCompany";
	}
	@RequestMapping(value="/statementOfCompany", method=RequestMethod.POST)
	public String InsertStatementOfCompany(){
		
		return "redirect:/main/statementOfCompany";
	}
	
}

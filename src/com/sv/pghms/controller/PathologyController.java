package com.sv.pghms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sv.pghms.service.PathologyService;

@Controller
@RequestMapping("/main")
public class PathologyController {
	
	@Autowired
	private PathologyService pathologyService;
	
	@RequestMapping(value="/admissionForm", method=RequestMethod.GET)
	public String AdmissionForm(Model model){
		
		return "AdmissionForm";
	}
	@RequestMapping(value="/financialDetailsOfPathology", method=RequestMethod.GET)
	public String FinancialDetailsOfPathology(Model model){
		
		return "FinancialDetailsOfPathology";
	}
	@RequestMapping(value="/monthlyStatementOfOperationSectionPathology", method=RequestMethod.GET)
	public String MonthlyStatementOfOperationSectionPathology(Model model){
		
		return "MonthlyStatementOfOperationSectionPathology";
	}
	@RequestMapping(value="/pathology", method=RequestMethod.GET)
	public String Pathology(Model model){
		
		return "Pathology";
	}
}

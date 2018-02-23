package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_MonthlyAccountOfPharmacy")
public class TMonthlyAccountOfPharmacy {

	@Id
	@Column(name="t_dateMAO")
	private String dateMAO;
	@Column(name="t_totalDebitMAO")
	private String totalDebitMAO;
	@Column(name="t_totCreditMAO")
	private String totCreditMAO;
	@Column(name="t_remarkMAO")
	private String remarkMAO;
	@Column(name="t_balanceMAO")
	private String balanceMAO;
	
	public String getDateMAO() {
		return dateMAO;
	}
	public void setDateMAO(String dateMAO) {
		this.dateMAO = dateMAO;
	}
	public String getTotalDebitMAO() {
		return totalDebitMAO;
	}
	public void setTotalDebitMAO(String totalDebitMAO) {
		this.totalDebitMAO = totalDebitMAO;
	}
	public String getTotCreditMAO() {
		return totCreditMAO;
	}
	public void setTotCreditMAO(String totCreditMAO) {
		this.totCreditMAO = totCreditMAO;
	}
	public String getRemarkMAO() {
		return remarkMAO;
	}
	public void setRemarkMAO(String remarkMAO) {
		this.remarkMAO = remarkMAO;
	}
	public String getBalanceMAO() {
		return balanceMAO;
	}
	public void setBalanceMAO(String balanceMAO) {
		this.balanceMAO = balanceMAO;
	}

}

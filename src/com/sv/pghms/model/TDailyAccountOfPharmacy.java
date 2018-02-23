package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_DailyAccountOfPharmacy")
public class TDailyAccountOfPharmacy {
	
	@Id
	@Column(name="t_descriptionDAOP")
	private String descriptionDAOP;
	@Column(name="t_debitDAOP")
	private String debitDAOP;
	@Column(name="t_creditDAOP")
	private String creditDAOP;
	@Column(name="t_balanceDAOP")
	private String balanceDAOP;
	
	public String getDescriptionDAOP() {
		return descriptionDAOP;
	}
	public void setDescriptionDAOP(String descriptionDAOP) {
		this.descriptionDAOP = descriptionDAOP;
	}
	public String getDebitDAOP() {
		return debitDAOP;
	}
	public void setDebitDAOP(String debitDAOP) {
		this.debitDAOP = debitDAOP;
	}
	public String getCreditDAOP() {
		return creditDAOP;
	}
	public void setCreditDAOP(String creditDAOP) {
		this.creditDAOP = creditDAOP;
	}
	public String getBalanceDAOP() {
		return balanceDAOP;
	}
	public void setBalanceDAOP(String balanceDAOP) {
		this.balanceDAOP = balanceDAOP;
	}
	
}

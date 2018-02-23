package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_FinancialDetailsOfPathology")
public class TFinancialDetailsOfPathology {

	@Id
	@Column(name="t_descriptionFDOP")
	private String descriptionFDOP;
	@Column(name="t_creditFDOP")
	private String creditFDOP;
	@Column(name="t_debitFDOP")
	private String debitFDOP;
	@Column(name="t_balanceFDOP")
	private String balanceFDOP;
	
	public String getDescriptionFDOP() {
		return descriptionFDOP;
	}
	public void setDescriptionFDOP(String descriptionFDOP) {
		this.descriptionFDOP = descriptionFDOP;
	}
	public String getCreditFDOP() {
		return creditFDOP;
	}
	public void setCreditFDOP(String creditFDOP) {
		this.creditFDOP = creditFDOP;
	}
	public String getDebitFDOP() {
		return debitFDOP;
	}
	public void setDebitFDOP(String debitFDOP) {
		this.debitFDOP = debitFDOP;
	}
	public String getBalanceFDOP() {
		return balanceFDOP;
	}
	public void setBalanceFDOP(String balanceFDOP) {
		this.balanceFDOP = balanceFDOP;
	}
	
}

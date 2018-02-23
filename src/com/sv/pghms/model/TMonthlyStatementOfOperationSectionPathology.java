package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_MonthlyStatementOfOperationSectionPathology")
public class TMonthlyStatementOfOperationSectionPathology {

	@Id
	@Column(name="t_slNoMSOSP")
	private String slNoMSOSP;
	@Column(name="t_datePathMSOSP")
	private String datePathMSOSP;
	@Column(name="t_ptnNamePathMSOSP")
	private String ptnNamePathMSOSP;
	@Column(name="t_operNamePathMSOSP")
	private String operNamePathMSOSP;
	@Column(name="t_contMoneyPathMSOSP")
	private String contMoneyPathMSOSP;
	@Column(name="t_anesthPaymentPathMSOSP")
	private String anesthPaymentPathMSOSP;
	@Column(name="t_srgnPaymentPathMSOSP")
	private String srgnPaymentPathMSOSP;
	@Column(name="t_agntCommPathMSOSP")
	private String agntCommPathMSOSP;
	@Column(name="t_medicinePathMSOSP")
	private String medicinePathMSOSP;
	@Column(name="t_nurseCommPathMSOSP")
	private String nurseCommPathMSOSP;
	@Column(name="t_netAmountMSOSP")
	private String netAmountMSOSP;
	
	public String getSlNoMSOSP() {
		return slNoMSOSP;
	}
	public void setSlNoMSOSP(String slNoMSOSP) {
		this.slNoMSOSP = slNoMSOSP;
	}
	public String getDatePathMSOSP() {
		return datePathMSOSP;
	}
	public void setDatePathMSOSP(String datePathMSOSP) {
		this.datePathMSOSP = datePathMSOSP;
	}
	public String getPtnNamePathMSOSP() {
		return ptnNamePathMSOSP;
	}
	public void setPtnNamePathMSOSP(String ptnNamePathMSOSP) {
		this.ptnNamePathMSOSP = ptnNamePathMSOSP;
	}
	public String getOperNamePathMSOSP() {
		return operNamePathMSOSP;
	}
	public void setOperNamePathMSOSP(String operNamePathMSOSP) {
		this.operNamePathMSOSP = operNamePathMSOSP;
	}
	public String getContMoneyPathMSOSP() {
		return contMoneyPathMSOSP;
	}
	public void setContMoneyPathMSOSP(String contMoneyPathMSOSP) {
		this.contMoneyPathMSOSP = contMoneyPathMSOSP;
	}
	public String getAnesthPaymentPathMSOSP() {
		return anesthPaymentPathMSOSP;
	}
	public void setAnesthPaymentPathMSOSP(String anesthPaymentPathMSOSP) {
		this.anesthPaymentPathMSOSP = anesthPaymentPathMSOSP;
	}
	public String getSrgnPaymentPathMSOSP() {
		return srgnPaymentPathMSOSP;
	}
	public void setSrgnPaymentPathMSOSP(String srgnPaymentPathMSOSP) {
		this.srgnPaymentPathMSOSP = srgnPaymentPathMSOSP;
	}
	public String getAgntCommPathMSOSP() {
		return agntCommPathMSOSP;
	}
	public void setAgntCommPathMSOSP(String agntCommPathMSOSP) {
		this.agntCommPathMSOSP = agntCommPathMSOSP;
	}
	public String getMedicinePathMSOSP() {
		return medicinePathMSOSP;
	}
	public void setMedicinePathMSOSP(String medicinePathMSOSP) {
		this.medicinePathMSOSP = medicinePathMSOSP;
	}
	public String getNurseCommPathMSOSP() {
		return nurseCommPathMSOSP;
	}
	public void setNurseCommPathMSOSP(String nurseCommPathMSOSP) {
		this.nurseCommPathMSOSP = nurseCommPathMSOSP;
	}
	public String getNetAmountMSOSP() {
		return netAmountMSOSP;
	}
	public void setNetAmountMSOSP(String netAmountMSOSP) {
		this.netAmountMSOSP = netAmountMSOSP;
	}
	
}

package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_MonthlyStatementOfOperationSectionPharmacy")
public class TMonthlyStatementOfOperationSectionPharmacy {

	@Id
	@Column(name="t_slNoMSOS")
	private String slNoMSOS;
	@Column(name="t_ptnNameMSOS")
	private String ptnNameMSOS;
	@Column(name="t_dateMSOS")
	private String dateMSOS;
	@Column(name="t_operNameMSOS")
	private String operNameMSOS;
	@Column(name="t_contMoneyMSOS")
	private String contMoneyMSOS;
	@Column(name="t_anesthPaymentMSOS")
	private String anesthPaymentMSOS;
	@Column(name="t_srgnPaymentMSOS")
	private String srgnPaymentMSOS;
	@Column(name="t_agntCommMSOS")
	private String agntCommMSOS;
	@Column(name="t_medicineMSOS")
	private String medicineMSOS;
	@Column(name="t_nurseCommMSOS")
	private String nurseCommMSOS;
	@Column(name="t_netAmountMSOS")
	private String netAmountMSOS;
	
	public String getSlNoMSOS() {
		return slNoMSOS;
	}
	public void setSlNoMSOS(String slNoMSOS) {
		this.slNoMSOS = slNoMSOS;
	}
	public String getPtnNameMSOS() {
		return ptnNameMSOS;
	}
	public void setPtnNameMSOS(String ptnNameMSOS) {
		this.ptnNameMSOS = ptnNameMSOS;
	}
	public String getDateMSOS() {
		return dateMSOS;
	}
	public void setDateMSOS(String dateMSOS) {
		this.dateMSOS = dateMSOS;
	}
	public String getOperNameMSOS() {
		return operNameMSOS;
	}
	public void setOperNameMSOS(String operNameMSOS) {
		this.operNameMSOS = operNameMSOS;
	}
	public String getContMoneyMSOS() {
		return contMoneyMSOS;
	}
	public void setContMoneyMSOS(String contMoneyMSOS) {
		this.contMoneyMSOS = contMoneyMSOS;
	}
	public String getAnesthPaymentMSOS() {
		return anesthPaymentMSOS;
	}
	public void setAnesthPaymentMSOS(String anesthPaymentMSOS) {
		this.anesthPaymentMSOS = anesthPaymentMSOS;
	}
	public String getSrgnPaymentMSOS() {
		return srgnPaymentMSOS;
	}
	public void setSrgnPaymentMSOS(String srgnPaymentMSOS) {
		this.srgnPaymentMSOS = srgnPaymentMSOS;
	}
	public String getAgntCommMSOS() {
		return agntCommMSOS;
	}
	public void setAgntCommMSOS(String agntCommMSOS) {
		this.agntCommMSOS = agntCommMSOS;
	}
	public String getMedicineMSOS() {
		return medicineMSOS;
	}
	public void setMedicineMSOS(String medicineMSOS) {
		this.medicineMSOS = medicineMSOS;
	}
	public String getNurseCommMSOS() {
		return nurseCommMSOS;
	}
	public void setNurseCommMSOS(String nurseCommMSOS) {
		this.nurseCommMSOS = nurseCommMSOS;
	}
	public String getNetAmountMSOS() {
		return netAmountMSOS;
	}
	public void setNetAmountMSOS(String netAmountMSOS) {
		this.netAmountMSOS = netAmountMSOS;
	}
	
}

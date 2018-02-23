package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_StatementOfCompany")
public class TStatementOfCompany {

	@Id
	@Column(name="t_nameOfCompanySOC")
	private String nameOfCompanySOC;
	@Column(name="t_invoiceNoSOC")
	private String invoiceNoSOC;
	@Column(name="t_creditDateSOC")
	private String creditDateSOC;
	@Column(name="t_transactionCreditSOC")
	private String transactionCreditSOC;
	@Column(name="t_debitDateSOC")
	private String debitDateSOC;
	@Column(name="t_transactionDebitSOC")
	private String transactionDebitSOC;
	@Column(name="t_balanceSOC")
	private String balanceSOC;
	
	public String getNameOfCompanySOC() {
		return nameOfCompanySOC;
	}
	public void setNameOfCompanySOC(String nameOfCompanySOC) {
		this.nameOfCompanySOC = nameOfCompanySOC;
	}
	public String getInvoiceNoSOC() {
		return invoiceNoSOC;
	}
	public void setInvoiceNoSOC(String invoiceNoSOC) {
		this.invoiceNoSOC = invoiceNoSOC;
	}
	public String getCreditDateSOC() {
		return creditDateSOC;
	}
	public void setCreditDateSOC(String creditDateSOC) {
		this.creditDateSOC = creditDateSOC;
	}
	public String getTransactionCreditSOC() {
		return transactionCreditSOC;
	}
	public void setTransactionCreditSOC(String transactionCreditSOC) {
		this.transactionCreditSOC = transactionCreditSOC;
	}
	public String getDebitDateSOC() {
		return debitDateSOC;
	}
	public void setDebitDateSOC(String debitDateSOC) {
		this.debitDateSOC = debitDateSOC;
	}
	public String getTransactionDebitSOC() {
		return transactionDebitSOC;
	}
	public void setTransactionDebitSOC(String transactionDebitSOC) {
		this.transactionDebitSOC = transactionDebitSOC;
	}
	public String getBalanceSOC() {
		return balanceSOC;
	}
	public void setBalanceSOC(String balanceSOC) {
		this.balanceSOC = balanceSOC;
	}
	
}

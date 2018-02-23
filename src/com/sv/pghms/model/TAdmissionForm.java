package com.sv.pghms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_AdmissionForm")
public class TAdmissionForm {

	@Id
	@Column(name="t_serialNoAF")
	private String serialNoAF;
	@Column(name="t_dateAF")
	private String dateAF;
	@Column(name="t_patientName")
	private String patientName;
	@Column(name="t_addressAF")
	private String addressAF;
	@Column(name="t_mobileNoAF")
	private String mobileNoAF;
	@Column(name="t_sexAF")
	private String sexAF;
	@Column(name="t_ageAF")
	private String ageAF;
	@Column(name="t_referenceNameAF")
	private String referenceNameAF;
	@Column(name="t_nameOfOperation")
	private String nameOfOperation;
	@Column(name="t_typeOfOperationAF")
	private String typeOfOperationAF;
	@Column(name="t_nameOfSurgeonAF")
	private String nameOfSurgeonAF;
	@Column(name="t_medicineAF")
	private String medicineAF;
	@Column(name="t_normalPriceAF")
	private String normalPriceAF;
	@Column(name="t_contPriceAF")
	private String contPriceAF;
	@Column(name="t_medicinePriceAF")
	private String medicinePriceAF;
	@Column(name="t_discountMAF")
	private String discountMAF;
	@Column(name="t_discountOAF")
	private String discountOAF;
	@Column(name="t_discountAuthorityAF")
	private String discountAuthorityAF;
	@Column(name="t_totalAF")
	private String totalAF;
	@Column(name="t_firstPaymentAF")
	private String firstPaymentAF;
	@Column(name="t_secondPaymentAF")
	private String secondPaymentAF;
	@Column(name="t_lastPaymentAF")
	private String lastPaymentAF;
	@Column(name="t_othersClearanceAF")
	private String othersClearanceAF;
	public String getDateAF() {
		return dateAF;
	}
	public void setDateAF(String dateAF) {
		this.dateAF = dateAF;
	}
	public String getSerialNoAF() {
		return serialNoAF;
	}
	public void setSerialNoAF(String serialNoAF) {
		this.serialNoAF = serialNoAF;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddressAF() {
		return addressAF;
	}
	public void setAddressAF(String addressAF) {
		this.addressAF = addressAF;
	}
	public String getMobileNoAF() {
		return mobileNoAF;
	}
	public void setMobileNoAF(String mobileNoAF) {
		this.mobileNoAF = mobileNoAF;
	}
	public String getSexAF() {
		return sexAF;
	}
	public void setSexAF(String sexAF) {
		this.sexAF = sexAF;
	}
	public String getAgeAF() {
		return ageAF;
	}
	public void setAgeAF(String ageAF) {
		this.ageAF = ageAF;
	}
	public String getReferenceNameAF() {
		return referenceNameAF;
	}
	public void setReferenceNameAF(String referenceNameAF) {
		this.referenceNameAF = referenceNameAF;
	}
	public String getNameOfOperation() {
		return nameOfOperation;
	}
	public void setNameOfOperation(String nameOfOperation) {
		this.nameOfOperation = nameOfOperation;
	}
	public String getTypeOfOperationAF() {
		return typeOfOperationAF;
	}
	public void setTypeOfOperationAF(String typeOfOperationAF) {
		this.typeOfOperationAF = typeOfOperationAF;
	}
	public String getNameOfSurgeonAF() {
		return nameOfSurgeonAF;
	}
	public void setNameOfSurgeonAF(String nameOfSurgeonAF) {
		this.nameOfSurgeonAF = nameOfSurgeonAF;
	}
	public String getMedicineAF() {
		return medicineAF;
	}
	public void setMedicineAF(String medicineAF) {
		this.medicineAF = medicineAF;
	}
	public String getNormalPriceAF() {
		return normalPriceAF;
	}
	public void setNormalPriceAF(String normalPriceAF) {
		this.normalPriceAF = normalPriceAF;
	}
	public String getContPriceAF() {
		return contPriceAF;
	}
	public void setContPriceAF(String contPriceAF) {
		this.contPriceAF = contPriceAF;
	}
	public String getMedicinePriceAF() {
		return medicinePriceAF;
	}
	public void setMedicinePriceAF(String medicinePriceAF) {
		this.medicinePriceAF = medicinePriceAF;
	}
	public String getDiscountMAF() {
		return discountMAF;
	}
	public void setDiscountMAF(String discountMAF) {
		this.discountMAF = discountMAF;
	}
	public String getDiscountOAF() {
		return discountOAF;
	}
	public void setDiscountOAF(String discountOAF) {
		this.discountOAF = discountOAF;
	}
	public String getDiscountAuthorityAF() {
		return discountAuthorityAF;
	}
	public void setDiscountAuthorityAF(String discountAuthorityAF) {
		this.discountAuthorityAF = discountAuthorityAF;
	}
	public String getTotalAF() {
		return totalAF;
	}
	public void setTotalAF(String totalAF) {
		this.totalAF = totalAF;
	}
	public String getFirstPaymentAF() {
		return firstPaymentAF;
	}
	public void setFirstPaymentAF(String firstPaymentAF) {
		this.firstPaymentAF = firstPaymentAF;
	}
	public String getSecondPaymentAF() {
		return secondPaymentAF;
	}
	public void setSecondPaymentAF(String secondPaymentAF) {
		this.secondPaymentAF = secondPaymentAF;
	}
	public String getLastPaymentAF() {
		return lastPaymentAF;
	}
	public void setLastPaymentAF(String lastPaymentAF) {
		this.lastPaymentAF = lastPaymentAF;
	}
	public String getOthersClearanceAF() {
		return othersClearanceAF;
	}
	public void setOthersClearanceAF(String othersClearanceAF) {
		this.othersClearanceAF = othersClearanceAF;
	}
	

}

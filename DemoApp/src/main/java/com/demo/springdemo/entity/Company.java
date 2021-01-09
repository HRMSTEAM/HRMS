package com.demo.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "company")
public class Company {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_id")
	private String companyId;

 	@Column(name = "company_name")
 	private String companyName;
	
	@Column(name = "company_address")
	private String companyAddress;
	
	@Column(name = "company_pincode")
	private String companyPinCode;

	@Column(name = "company_city")
	private String companyCity;

	@Column(name = "company_state") 
	private String companyState;

	@Column(name = "country")
	private String country;
	
	@Column(name = "gst_no")
	private String gstNo;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "deleted_by")
	private String deletedBy;
	
	@Column(name = "deleted_date")
	private String deletedDate;	

	@Column(name = "status")
	private String status;

	public String getCompanyId() {
		return companyId;
	}
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPinCode() {
		return companyPinCode;
	}

	public void setCompanyPinCode(String companyPinCode) {
		this.companyPinCode = companyPinCode;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyState() {
		return companyState;
	}

	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyPinCode=" + companyPinCode + ", companyCity=" + companyCity + ", companyState="
				+ companyState + ", country=" + country + ", gstNo=" + gstNo + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", deletedBy=" + deletedBy + ", deletedDate=" + deletedDate
				+ ", status=" + status + "]";
	}


	
	
	
}

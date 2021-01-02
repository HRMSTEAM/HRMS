package com.demo.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "company_id")
 	String companyId;

 	@Column(name = "company_name")
	String companyName;

	
	@Column(name = "company_address")
      String companyAddress;

	@Column(name = "company_city")
	String companyCity;

	@Column(name = "company_state") 
	String companyState;

	@Column(name = "country")
 	String country;
	
	@Column(name = "gst_no")
 	String gstNo;
	
	@Column(name = "created_by")
 	String createdBy;
	
	@Column(name = "created_date")
 	String createdDate;
	
	@Column(name = "deleted_by")
 	String deletedBy;
	
	@Column(name = "deleted_date")
 	String deletedDate;
	

	@Column(name = "status")
 	String status;


	/**
	 * @return the companyId
	 */
	private String getCompanyId() {
		return companyId;
	}


	/**
	 * @param companyId the companyId to set
	 */
	private void setCompanyId(String companyId) {
		this.companyId = companyId;
	}


	/**
	 * @return the companyName
	 */
	private String getCompanyName() {
		return companyName;
	}


	/**
	 * @param companyName the companyName to set
	 */
	private void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	/**
	 * @return the companyAddress
	 */
	private String getCompanyAddress() {
		return companyAddress;
	}


	/**
	 * @param companyAddress the companyAddress to set
	 */
	private void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	/**
	 * @return the companyCity
	 */
	private String getCompanyCity() {
		return companyCity;
	}


	/**
	 * @param companyCity the companyCity to set
	 */
	private void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}


	/**
	 * @return the companyState
	 */
	private String getCompanyState() {
		return companyState;
	}


	/**
	 * @param companyState the companyState to set
	 */
	private void setCompanyState(String companyState) {
		this.companyState = companyState;
	}


	/**
	 * @return the country
	 */
	private String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	private void setCountry(String country) {
		this.country = country;
	}


	/**
	 * @return the gstNo
	 */
	private String getGstNo() {
		return gstNo;
	}


	/**
	 * @param gstNo the gstNo to set
	 */
	private void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}


	/**
	 * @return the createdBy
	 */
	private String getCreatedBy() {
		return createdBy;
	}


	/**
	 * @param createdBy the createdBy to set
	 */
	private void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	/**
	 * @return the createdDate
	 */
	private String getCreatedDate() {
		return createdDate;
	}


	/**
	 * @param createdDate the createdDate to set
	 */
	private void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}


	/**
	 * @return the deletedBy
	 */
	private String getDeletedBy() {
		return deletedBy;
	}


	/**
	 * @param deletedBy the deletedBy to set
	 */
	private void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}


	/**
	 * @return the deletedDate
	 */
	private String getDeletedDate() {
		return deletedDate;
	}


	/**
	 * @param deletedDate the deletedDate to set
	 */
	private void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}


	/**
	 * @return the status
	 */
	private String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	private void setStatus(String status) {
		this.status = status;
	}


	private Company(String companyId, String companyName, String companyAddress, String companyCity,
			String companyState, String country, String gstNo, String createdBy, String createdDate, String deletedBy,
			String deletedDate, String status) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.country = country;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.deletedBy = deletedBy;
		this.deletedDate = deletedDate;
		this.status = status;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyCity=" + companyCity + ", companyState=" + companyState + ", country=" + country
				+ ", gstNo=" + gstNo + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", deletedBy="
				+ deletedBy + ", deletedDate=" + deletedDate + ", status=" + status + "]";
	}

	

}

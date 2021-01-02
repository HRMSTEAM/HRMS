package com.demo.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name = "branch")
public class Branch {

	@Id
	@Column(name = "company_id")
	private String companyId;
	
	@Id
	@Column(name = "branch_id")
	private String branchId;

 	@Column(name = "branch_name")
 	private String branchName;

	
	@Column(name = "branch_address")
	private String branchAddress;

	@Column(name = "branch_city")
	private String branchCity;

	@Column(name = "branch_state") 
	private String branchState;

	@Column(name = "branch_pincode") 
	private String branchPincode;
	
	
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


	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}


	public String getBranchId() {
		return branchId;
	}


	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getBranchAddress() {
		return branchAddress;
	}


	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}


	public String getBranchCity() {
		return branchCity;
	}


	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}


	public String getBranchState() {
		return branchState;
	}


	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}


	public String getBranchPincode() {
		return branchPincode;
	}


	public void setBranchPincode(String branchPincode) {
		this.branchPincode = branchPincode;
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



}
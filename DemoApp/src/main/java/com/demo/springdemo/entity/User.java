package com.demo.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

	//@Id
	@Column(name = "company_id")
	private String companyId;
	
	//@Id
	@Column(name = "branch_id")
	private String branchId;
	
	//@Id
	@Column(name = "department_id")
	private String departmentId;
	
	@Id
	@Column(name = "user_id")
	@NotNull(message = "is required")
	@Size(min = 5, message = "User Id size must be greatr than 5")
	private String userId;
	
	@Column(name="user_code")
	private String userCode;
	
	@Column(name = "user_name")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private  String userName;

	@NotNull(message = "is required")
	@Size(min = 8, message = "minimum 8 charaters and alphabets required")
	@Column(name = "user_password")
	private String userPassword;

	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "gender")
	@NotNull(message = "Please select gender")
	private String gender;
	
	@Column(name="user_address")
	private String userAddress;
	
	@Column(name="user_pincode")
	private String userPincode;
	
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


	public String getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public String getUserPincode() {
		return userPincode;
	}


	public void setUserPincode(String userPincode) {
		this.userPincode = userPincode;
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

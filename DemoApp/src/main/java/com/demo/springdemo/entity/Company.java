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
	private String deletedBy;
	
	@Column(name = "deleted_date")
	private String deletedDate;
	

	@Column(name = "status")
	private String status;

	

}

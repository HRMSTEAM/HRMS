package com.demo.springdemo.service;

import java.util.List;

import com.demo.springdemo.entity.Company;
 
public interface CompanyService {
 	
	public List<Company> getCompany();
	
	public Company getCompany(String companyId);
	 
}

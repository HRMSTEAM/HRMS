package com.demo.springdemo.service;

import java.util.List;

import com.demo.springdemo.entity.Company;
 
public interface CompanyService {
 	
	public void saveCompany(Company company);
	
	public List<Company> getCompany();
	
	public Company getCompany(String companyId);
	
	public void deleteCompany(String companyId);
	 
}

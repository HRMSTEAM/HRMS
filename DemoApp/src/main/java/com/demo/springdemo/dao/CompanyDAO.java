package com.demo.springdemo.dao;

import java.util.List;

import com.demo.springdemo.entity.Company;
 
public interface CompanyDAO {
	
	public void saveCompany (Company company);
	
 	public List<Company> getCompany();
 	
 	public Company getCompany(String companyId);
	
	public void deleteCompany(String companyId);
	
	public String getMaxId();
 	
}

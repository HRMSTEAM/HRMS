package com.demo.springdemo.dao;

import java.util.List;

import com.demo.springdemo.entity.Company;
 
public interface CompanyDAO {
 	public List<Company> getCompany();
 	public Company getCompany(String companyId);
 	
}

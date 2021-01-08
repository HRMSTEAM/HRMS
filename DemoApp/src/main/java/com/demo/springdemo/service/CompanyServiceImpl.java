package com.demo.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springdemo.dao.CompanyDAO;
import com.demo.springdemo.entity.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyDAO companyDAO;

	@Transactional
	public void saveCompany(Company company) {
		companyDAO.saveCompany(company);		
	}

	@Transactional
	public List<Company> getCompany() {
		return companyDAO.getCompany();
	}

	@Transactional
	public Company getCompany(String companyId) {
		return companyDAO.getCompany(companyId);
	}
	
	@Transactional
	public void deleteCompany(String companyId) {
		companyDAO.deleteCompany(companyId);		
	}	 

}

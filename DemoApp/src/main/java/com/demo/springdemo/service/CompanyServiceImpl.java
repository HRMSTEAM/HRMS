package com.demo.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springdemo.dao.CompanyDAO;
import com.demo.springdemo.dao.UserDAO;
import com.demo.springdemo.entity.Company;
import com.demo.springdemo.entity.User;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyDAO CompanyDAO;

	 

	@Transactional
	public List<Company> getCompany() {
		return CompanyDAO.getCompany();
	}

	@Transactional
	public Company getCompany(String companyId) {
		return CompanyDAO.getCompany(companyId);
	}

	 

}

package com.demo.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.springdemo.entity.Company;
import com.demo.springdemo.entity.User;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	SessionFactory sessionFactory;
  	public List<Company> getCompany() {

		Session currentSession = sessionFactory.getCurrentSession();
 		Query<Company> theQuery = currentSession.createQuery("from Company", Company.class);
 		List<Company> company = theQuery.getResultList();
 		return company;
	}
 	public Company getCompany(String companyId) {
		Session currentSession = sessionFactory.getCurrentSession();
 		Company theCompany = currentSession.get(Company.class, companyId);
 		return theCompany;
	}
 
}

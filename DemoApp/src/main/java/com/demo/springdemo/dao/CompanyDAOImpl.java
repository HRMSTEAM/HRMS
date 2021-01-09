package com.demo.springdemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.springdemo.entity.Company;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveCompany(Company company) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		if(company.getCompanyId().equals("") || company.getCompanyId()==null){
			String cmp_id = getMaxId();
			company.setCompanyId(cmp_id);
		}
		
		currentSession.saveOrUpdate(company);
	}	

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
 	
 	public void deleteCompany(String companyId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Company where companyId=:companyId");
		
		theQuery.setParameter("companyId", companyId);
		
		theQuery.executeUpdate();
		
	}
 	
 	public String getMaxId() {
		
 		Session currentSession = sessionFactory.getCurrentSession();
 		String str = null;
		
		@SuppressWarnings("deprecation")
		Criteria criteria = currentSession.createCriteria(Company.class).setProjection(Projections.max("companyId"));
		String maxid = (String)criteria.uniqueResult();
		
		if (maxid != null) {
			String letter = maxid.substring(0, 2);
			String number = maxid.substring(2);
			int integer_number = Integer.parseInt(number);
			integer_number = integer_number + 1;
			String strnumber = Integer.toString(integer_number);
			
			switch (strnumber.length()) {
			case 1:
				str = "0000000" + strnumber;
				break;
			case 2:
				str = "000000" + strnumber;
				break;

			case 3:
				str = "00000" + strnumber;
				break;

			case 4:
				str = "0000" + strnumber;
				break;
			case 5:
				str = "000" + strnumber;
				break;
				
			case 6:
				str = "00" + strnumber;
				break;
				
			case 7:
				str = "0" + strnumber;
				break;
				
			case 8:
				str = strnumber;
				break;
			}
			str = letter + str;
		} else {
			str = "CP00000001";
		}
		
		return str;
	}
 
}

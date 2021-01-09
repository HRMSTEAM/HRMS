package com.demo.springdemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.springdemo.entity.Branch;
import com.demo.springdemo.entity.Company;

@Repository
public class BranchDAOImpl implements BranchDAO {

	@Autowired
	SessionFactory sessionFactory;
		
	public void saveBranch(Branch branch) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		if(branch.getBranchId().equals("") || branch.getBranchId()==null){
			branch.setBranchId(getMaxId());
		}
		
		Company company = currentSession.get(Company.class, branch.getCompany().getCompanyId());		
		branch.setCompany(company);
		
		currentSession.saveOrUpdate(branch);
	}
	
	public List<Branch> getBranches() {

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Branch> theQuery = currentSession.createQuery("from Branch", Branch.class);
		
		List<Branch> branch = theQuery.getResultList();
		
		return branch;
	}

	public Branch getBranch(String branchId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Branch theBranch = currentSession.get(Branch.class, branchId);
		
		return theBranch;
	}

	public void deleteBranch(String branchId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Branch where branchId=:branchId");
		
		theQuery.setParameter("branchId", branchId);
		
		theQuery.executeUpdate();
		
	}
	
public String getMaxId() {
		
 		Session currentSession = sessionFactory.getCurrentSession();
 		String str = null;
		
		@SuppressWarnings("deprecation")
		Criteria criteria = currentSession.createCriteria(Branch.class).setProjection(Projections.max("branchId"));
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
			str = "BR00000001";
		}
		
		return str;
	}

}

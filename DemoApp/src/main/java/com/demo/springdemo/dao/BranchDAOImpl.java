package com.demo.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		
		Company company = currentSession.get(Company.class, "C00001"/*branch.getCompany().getCompanyId()*/);
		
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

}

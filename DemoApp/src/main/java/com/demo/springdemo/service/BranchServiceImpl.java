package com.demo.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springdemo.dao.BranchDAO;
import com.demo.springdemo.entity.Branch;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	BranchDAO branchDAO;

	@Transactional
	public void saveBranch(Branch branch) {
		branchDAO.saveBranch(branch);		
	}

	@Transactional
	public List<Branch> getBranches() {
		return branchDAO.getBranches();
	}

	@Transactional
	public Branch getBranch(String branchId) {
		return branchDAO.getBranch(branchId);
	}

	@Transactional
	public void deleteBranch(String branchId) {
		branchDAO.deleteBranch(branchId);		
	}


}

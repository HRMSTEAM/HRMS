package com.demo.springdemo.dao;

import java.util.List;

import com.demo.springdemo.entity.Branch;

public interface BranchDAO {

	public void saveBranch(Branch branch);
	
	public List<Branch> getBranches();
	
	public Branch getBranch(String branchId);
	
	public void deleteBranch(String branchId);
	
	public String getMaxId();
	
}

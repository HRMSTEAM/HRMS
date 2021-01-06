package com.demo.springdemo.service;

import java.util.List;

import com.demo.springdemo.entity.Branch;

public interface BranchService {

	public void saveBranch(Branch branch);
	
	public List<Branch> getBranches();
	
	public Branch getBranch(String branchId);
	
	public void deleteBranch(String branchId);
	
}

package com.demo.springdemo.dao;

import java.util.List;

import com.demo.springdemo.entity.Department;

public interface DepartmentDAO {

	public void saveDepartment(Department department);
	
	public List<Department> getDepartments();
	
	public Department getDepartment(String departmentId);
	
	public void deleteDepartment(String departmentId);
	
	public String getMaxId();
	
}

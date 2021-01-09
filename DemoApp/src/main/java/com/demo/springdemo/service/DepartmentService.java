package com.demo.springdemo.service;

import java.util.List;

import com.demo.springdemo.entity.Department;

public interface DepartmentService {

	public void saveDepartment(Department department);
	
	public List<Department> getDepartmentes();
	
	public Department getDepartment(String departmentId);
	
	public void deleteDepartment(String departmentId);
	
}

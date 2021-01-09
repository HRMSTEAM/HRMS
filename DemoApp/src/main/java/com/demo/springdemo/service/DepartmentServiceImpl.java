package com.demo.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springdemo.dao.DepartmentDAO;
import com.demo.springdemo.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDAO departmentDAO;

	@Transactional
	public void saveDepartment(Department department) {
		departmentDAO.saveDepartment(department);		
	}

	@Transactional
	public List<Department> getDepartmentes() {
		return departmentDAO.getDepartmentes();
	}

	@Transactional
	public Department getDepartment(String departmentId) {
		return departmentDAO.getDepartment(departmentId);
	}

	@Transactional
	public void deleteDepartment(String departmentId) {
		departmentDAO.deleteDepartment(departmentId);		
	}


}

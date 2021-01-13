package com.demo.springdemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.springdemo.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	SessionFactory sessionFactory;
		
	public void saveDepartment(Department department) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		if(department.getDepartmentId().equals("") || department.getDepartmentId()==null){
			department.setDepartmentId(getMaxId());
		}
		
		currentSession.saveOrUpdate(department);
	}
	
	public List<Department> getDepartmentes() {

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Department> theQuery = currentSession.createQuery("from Department", Department.class);
		
		List<Department> department = theQuery.getResultList();
		
		return department;
	}

	public Department getDepartment(String departmentId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Department theDepartment = currentSession.get(Department.class, departmentId);
		
		return theDepartment;
	}

	public void deleteDepartment(String departmentId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Department where departmentId=:departmentId");
		
		theQuery.setParameter("departmentId", departmentId);
		
		theQuery.executeUpdate();
		
	}
	
public String getMaxId() {
		
 		Session currentSession = sessionFactory.getCurrentSession();
 		String str = null;
		
		@SuppressWarnings("deprecation")
		Criteria criteria = currentSession.createCriteria(Department.class).setProjection(Projections.max("departmentId"));
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
			str = "DP00000001";
		}
		
		return str;
	}

}

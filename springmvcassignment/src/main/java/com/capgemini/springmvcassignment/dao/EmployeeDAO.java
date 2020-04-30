package com.capgemini.springmvcassignment.dao;

import java.util.List;

import com.capgemini.springmvcassignment.bean.EmployeePrimary;

public interface EmployeeDAO {
	
	boolean updateEmployeeInfo(EmployeePrimary info);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeePrimary info);
	List<EmployeePrimary>  getAllRecordsEmployee();
	EmployeePrimary getEmployeeDetail(int id);

}

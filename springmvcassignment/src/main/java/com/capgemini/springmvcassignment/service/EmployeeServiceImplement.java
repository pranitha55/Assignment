package com.capgemini.springmvcassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springmvcassignment.bean.EmployeePrimary;
import com.capgemini.springmvcassignment.dao.EmployeeDAO;

@Service
public class EmployeeServiceImplement implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean updateEmployeeInfo(EmployeePrimary info) {
		return dao.updateEmployeeInfo(info);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimary info) {
		return dao.createEmployeeInfo(info);
	}

	@Override
	public List<EmployeePrimary> getAllRecordsEmployee() {
		return dao.getAllRecordsEmployee();
	}

	@Override
	public EmployeePrimary getEmployeeDetail(int id) {
		return dao.getEmployeeDetail(id);
	}

}

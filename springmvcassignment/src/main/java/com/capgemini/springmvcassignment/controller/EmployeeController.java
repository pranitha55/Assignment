package com.capgemini.springmvcassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvcassignment.bean.EmployeePrimary;
import com.capgemini.springmvcassignment.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/add")
	public String getForm() {
		return "addemployee";
	}

	@PostMapping("/added")
	public String submitForm(EmployeePrimary info,ModelMap map) {
		boolean added = service.createEmployeeInfo(info);
		if(added) {
			return "hello";
		} else {
			return "addemployee";
		}
	}

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchEmp";
	}

	@GetMapping("/searchEmployee")
	public String getDetail(int id,ModelMap map) {
		EmployeePrimary bean =  service.getEmployeeDetail(id);
		if(bean!=null) {
			map.addAttribute("bean",bean);
			return "searchJsp";
		} else {
			return "searchEmp";
		}
	}
	
	@GetMapping("/delete")
	public String getDeleteForm() {
		return "delete";
	}

	@GetMapping("/deleteEmployee")
	public String deleted(int id,ModelMap map) {
		boolean deleted = service.deleteEmployeeInfo(id);
		if(deleted) {
			map.addAttribute("hello", "Record Deleted");
			return "hello";
		} else {
			return "delete";
		}
	}
	
	@GetMapping("/getAll")
	public String getGetAll() {
		return "getDetailEmployee";
	}
	
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(ModelMap map) {
		List<EmployeePrimary> allRecord = service.getAllRecordsEmployee();
		map.addAttribute("list",allRecord);
		return "getAllEmployee";
	}
	
	@GetMapping("/update")
	public String getUpdateForm() {
		return "update";
	}
	
	@GetMapping("/updateEmployee")
	public String updated(EmployeePrimary info,ModelMap map) {
		boolean updated = service.updateEmployeeInfo(info);
		if(updated) {
			map.addAttribute("hello", "Record updated");
			return "hello";
		} else {
			return "update";
		}
	}

}

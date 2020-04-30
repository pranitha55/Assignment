package com.capgemini.springmvcassignment.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_primary")
public class EmployeePrimary implements Serializable{
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private double salary;
	@Column
	private String designation;
	@Column
	private String password;
}

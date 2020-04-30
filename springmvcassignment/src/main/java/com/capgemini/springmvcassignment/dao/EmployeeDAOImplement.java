package com.capgemini.springmvcassignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springmvcassignment.bean.EmployeePrimary;

@Repository
public class EmployeeDAOImplement implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean updateEmployeeInfo(EmployeePrimary info) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EmployeePrimary employeePrimary = manager.find(EmployeePrimary.class,info.getId());
		if(employeePrimary != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			employeePrimary.setAge(info.getAge());
			transaction.commit();
			isUpdated = true;
		}
		manager.close();
		return isUpdated;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EmployeePrimary employeePrimary = manager.find(EmployeePrimary.class,id);
		if(employeePrimary != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employeePrimary);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimary info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded =  false;
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			isAdded = true;
			System.out.println("added");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}

	@Override
	public List<EmployeePrimary> getAllRecordsEmployee() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from EmployeePrimary e";
		Query query = manager.createQuery(jpql);
		List<EmployeePrimary> recordList = query.getResultList();
		manager.close();
		return recordList;
	}

	@Override
	public EmployeePrimary getEmployeeDetail(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeePrimary employeePrimary = manager.find(EmployeePrimary.class,id);
		manager.close();
		return employeePrimary;
	}

}

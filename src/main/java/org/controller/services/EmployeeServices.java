package org.controller.services;

import java.util.List;

import org.hibernate.Query;
import org.model.Employees;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices implements ParentInterface 
{
  
	public void saveEmployee(Employees employee)
	{
		ses.beginTransaction();
		ses.save(employee);
		ses.getTransaction().commit();
	}
	public Employees getEmployee(int id)
	{
		ses.beginTransaction();
		Employees em=(Employees)ses.get(Employees.class,id);
		ses.getTransaction().commit();
		return em;
	}      
	
	public List<Employees>getEmployeeList()
	{
		ses.beginTransaction();
	    Query query	=ses.createQuery("from  Employees where id=1");
		List<Employees>employeeList=query.list();
		ses.getTransaction().commit();
		return employeeList ;
	}
}

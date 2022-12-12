package org.controller.services;

import java.util.List;

import org.hibernate.Query;
import org.model.Employees;
import org.springframework.stereotype.Service;

@Service
public class LoginServices implements ParentInterface
{
   
	public Employees getEmpe(String username,String password)
	{
		
		ses.beginTransaction();
	  Query query= ses.createQuery("from Employees where loginId='"+username+"' and password='"+password+"'");
	   List<Employees>employeeList= query.list();
	    ses.getTransaction().commit();
		
		if(!employeeList.isEmpty())
		{
			return employeeList.get(0);
		}
		else
		{
		return null;
		}
	

	}

	

}

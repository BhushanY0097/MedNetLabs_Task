package org.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.controller.services.EmployeeServices;
import org.controller.services.LoginServices;
import org.controller.services.ParentInterface;
import org.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController implements ParentInterface
{
	@Autowired
	private EmployeeServices employeeServices;
	
	@Autowired
	private LoginServices loginServices;
	
	
	public EmployeeController()
	{
	   System.out.println("EOC");
	}

	 @SuppressWarnings("unchecked")
	@RequestMapping(value = "/registerUser")
	public ModelAndView registerUser(HttpServletRequest req,HttpServletResponse resp)
	{
		 
		Map m= new HashMap< >();
		 
		   String id= req.getParameter("id");
		   String name= req.getParameter("name");
		   String gender= req.getParameter("gender");
		   String address= req.getParameter("address");
		   String state= req.getParameter("state");
		   String city= req.getParameter("city");
		   String dob= req.getParameter("dob");
		   String loginId= req.getParameter("loginId");
		   String password= req.getParameter("password");
		   
		   m.put("nameValue", name);
		   m.put("genderValue",gender);
		   m.put("addressValue",address);
		   m.put("stateValue", state);
		   m.put("cityValue", city);
		   m.put("dobValue", dob);
		   m.put("loginIdValue",loginId);
		   m.put("passwordValue",password);
		   
		   if(name.isEmpty())
		   {
			   m.put("error","Invalid name!");
		   }
		   else if(gender==null||gender.isEmpty())
		   {
			   m.put("error","Please Select Gender!"); 
		   }
		   else if(address.isEmpty())
		   {
			   m.put("error","Enter Address!"); 
		   }
		   else if(state.equals("-1"))
		   {
			   m.put("error","Please Select State!"); 
		   }			 			 			                                                              
		   else if(city.equals("-1"))
		   {
			   m.put("error","Please Select City!"); 
		   }
		   else if(dob==null||dob.isEmpty())
		   {
			   m.put("error","Please Enter DOB!"); 
		   }
		   else if(loginId==null)
		   {
			   m.put("error","Please Enter City!"); 
		   }
		   else if(password==null)
		   {
			   m.put("error","Please Enter password!"); 
		   }
		   else
		   {
		//	Employees employee= employeeServices.getEmployee(Integer.parseInt(id));
			   
			   Employees employee=new Employees();
			   employee.setAddress(address);
			   employee.setLoginId(loginId);
			   employee.setPassword(password);
			   employee.setGender(gender);
			   employee.setState(state);
			   employee.setCity(city);
			   employee.setCreated(new Date());
			   
			   try {
			     SimpleDateFormat sd = new  SimpleDateFormat("yyyy-MM-dd");
			        Date dobDate=sd.parse(dob);  
			        employee.setDob(dobDate);
			   }catch (Exception ex) {
				System.out.println(ex);
			}    
			 employee.setName(name);
			 employee.setModefied(new Date());
			 employeeServices.saveEmployee(employee); 
	     	  m.put("success","EMPLOYEE RECORDM SUBMITTED"); 
	     	
		   }
	    m.put("empdeList",employeeServices.getEmployeeList());
		return new ModelAndView("home",m);
	}
	 
	 @RequestMapping(value = "/loginUser")
	public ModelAndView loginUser(HttpServletRequest req,HttpServletResponse resp)
	{
		   HttpSession httpSession=req.getSession();
		   String username=req.getParameter("username");
		   String password=req.getParameter("password");
		 
		Employees emp= loginServices.getEmpe(username, password);
		   
		   Map m= new HashMap< >();
		   if(emp==null)
		   {
			  m.put("error","Invalid Usrname or password");
			  return new ModelAndView("login",m);
		   }
		   else
		   {
		  httpSession.setAttribute("UserLogin",emp);
		  m.put("employeeList",employeeServices.getEmployeeList());
		  return new ModelAndView("welcome",m);
		   }  
	}
}

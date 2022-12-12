package org.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{
	public HomeController()
	{
	    System.out.println("HC OC");
	}
	@RequestMapping(value = "/")
 public ModelAndView homePage(HttpServletRequest req,HttpServletResponse resp)
 {
	 return new ModelAndView("home");
 }
  @RequestMapping(value ="/Login")
   public ModelAndView loginPage(HttpServletRequest req,HttpServletResponse resp)
	{
		return new ModelAndView("login");
	}
  @RequestMapping(value ="/Register")
  public ModelAndView registerPage(HttpServletRequest req,HttpServletResponse resp)
	{
		return new ModelAndView("register");
	}
}

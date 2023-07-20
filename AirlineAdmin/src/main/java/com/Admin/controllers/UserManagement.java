package com.Admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Admin.entities.User;
import com.AirlineAdmin.services.Authorization;

@Controller
public class UserManagement {

	@RequestMapping(path="/AddUser" , method=RequestMethod.POST)
	public String AddUser(@ModelAttribute User user)
	{
		System.out.println("User >>>>>>>>>"+user);
		Authorization auth = new Authorization();
		auth.saveUser(user);
		System.out.println("User Added successfully");		
		return "";
	}
	
	@RequestMapping("/DeleteUser")
	public String DeleteUser()
	{
		return "DeleteUser";
	}
	
	@RequestMapping("/ModifyUser")
	public String UpdateUser()
	{
		return "ModifyUser";
	}
	
	@RequestMapping("/ShowUser")
	public String ViewUser()
	{
		return "ShowUser";
	}
}

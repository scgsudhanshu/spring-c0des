package com.Admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AirlineAdmin.services.Authorization;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String Login(Model model)
	{
		model.addAttribute("errmsg","");
		System.out.println("In Login page .....................");
		System.out.println("Checking Info ............... Please wait");
		return "login";
	}
	
	@RequestMapping("/authorize")
	public String Auth(@RequestParam("username") String username , @RequestParam("userpass") String password , Model model)
	{
		System.out.println("Username >>>>> "+username);
		System.out.println("Password >>>>>> "+password);
		
		Authorization auth = new Authorization();
		
		boolean status = auth.authorize(username, password);
		
		if(status == false)
		{
			model.addAttribute("errmsg","UserName or Password is incorrect");
			return "redirect:/login";
		}
		
		else
		{
			return "welcome";
		}	
		
		
	}
	
}

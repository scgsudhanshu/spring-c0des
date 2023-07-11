package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springMVC.model.Contact;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact()
	{
		return "processform";
	}
	
	@ModelAttribute
	public void common(Model model)
	{
		model.addAttribute("a","your contact info");
		System.out.println("Execution of common method");
	}
	
	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String processform(@RequestParam("email") String email,@RequestParam("phone") String phone)
	{	
		System.out.println("email-> :"+email+" , phone -> :"+phone);
		return "";
	}
	
	@RequestMapping(path="/processdata",method=RequestMethod.POST)
	public String processdata(@ModelAttribute Contact contact , Model model)
	{
		return "success";
	}
}

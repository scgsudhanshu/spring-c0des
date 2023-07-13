package com.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.springMVC.model.Contact;
import com.springMVC.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService service;
	
	
	
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
	
	/*
	 * @RequestMapping(path="/processdata",method=RequestMethod.POST) public String
	 * processdata(@ModelAttribute Contact contact , Model model) { String result =
	 * service.saveContact(contact); return "redirect:/success"; }
	 */
	
	@RequestMapping(path="/processdata",method=RequestMethod.POST)
	public RedirectView processdata(@ModelAttribute Contact contact , Model model)
	{
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl("success");
		
		String result = service.saveContact(contact);
		//redirectview.setAttributes("result",result);
		return redirectview;
	}
	
	
	@RequestMapping(path="/success")
	public String success(Model model)
	{
		System.out.println(" Rows Added Successfully .................");
		
		return "success";
	}
}

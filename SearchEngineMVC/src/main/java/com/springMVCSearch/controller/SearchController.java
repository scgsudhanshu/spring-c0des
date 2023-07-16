package com.springMVCSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {
	
	@GetMapping(path="/user/{userid}")
	public String pathVariableDemo(@PathVariable("userid") int userid)
	{
		System.out.println("Userid -> "+userid);
		return "home";
	}
	
	@RequestMapping("/home")
	public String homepage()
	{
		/*
		 * String abc = null; System.out.println(abc.length());
		 */
		return "Interceptor"; 
		
	}
	
	
	@RequestMapping("/welcome")
	public String welcomepage(@RequestParam("searchquery") String name,Model model)
	{
		/*
		 * String abc = null; System.out.println(abc.length());
		 */
		model.addAttribute("name",name);
		return "welcome"; 
		
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("searchquery") String query)
	{
		String url = "https://www.google.com/search?q=";
		url=url+query;
		System.out.println("url : "+url);
		RedirectView redirectview = new RedirectView();
		redirectview.setUrl(url);
		
		return redirectview;
		
	}
	
	/*
	 * @ExceptionHandler(Exception.class) public String ExceptionHandler(Exception
	 * e) { System.out.println("Exception >>>>>>"+e); return "exception_page"; }
	 */
}

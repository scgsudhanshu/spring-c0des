package com.springMVCSearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String homepage()
	{
		return "home"; 
		
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
}

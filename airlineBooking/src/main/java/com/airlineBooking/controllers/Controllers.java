package com.airlineBooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

	@RequestMapping("/home")
	public String Home()
	{
		return "home";
	}
	@RequestMapping("/contact")
	public String Contact()
	{
		return "contact";
	}
	@RequestMapping("/about")
	public String About()
	{
		return "about";
	}
	@RequestMapping("/book")
	public String BookFlight()
	{
		return "book";
	}
	@RequestMapping("/bookstatus")
	public String BookStatus()
	{
		return "bookstatus";
	}
	@RequestMapping("/history")
	public String History()
	{
		return "history";
	}
}

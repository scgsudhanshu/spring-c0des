package com.airlineBooking.controllers;

import java.net.http.HttpClient.Redirect;
import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.airlineBooking.entities.User;
import com.airlineBooking.services.UserService;

@Controller
public class Controllers {

	@Autowired
	private UserService userservice;
	
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
	
	/*
	@PostMapping("/SignUpUser")
	public ResponseEntity<?> signUpUser(@ModelAttribute User user)
	{
		
		System.out.println("User Added >>>>> ");
		User user_added = userservice.saveUser(user);
		return ResponseEntity.of(Optional.of(user_added));
	}
	*/
	
	@RequestMapping("/SignUpUser")
	public ModelAndView signUpUser(@ModelAttribute User user,ModelAndView modelandview)
	{
		
		System.out.println("User Added >>>>> ");
		User user_added = userservice.saveUser(user);
		modelandview.addObject("user","added");
		modelandview.setViewName("welcome");
		return modelandview;
	
	}
	
	
//	@GetMapping("/getUser/{id}")
//	public ResponseEntity<?> getUser(@PathVariable("id") int id)
//	{
//		
//		System.out.println("User Added >>>>> ");
//		User user_get = userservice.getUser(id);
//		return ResponseEntity.of(Optional.of(user_get));
//	}
	
	@GetMapping("/getUser/{id}")
	public ModelAndView getUser(@PathVariable("id") int id,ModelAndView modelandview)
	{
		
		System.out.println("User Added >>>>> ");
		User user_get = userservice.getUser(id);
		modelandview.addObject("user",user_get);
		modelandview.setViewName("info");
		return modelandview;
	}
}

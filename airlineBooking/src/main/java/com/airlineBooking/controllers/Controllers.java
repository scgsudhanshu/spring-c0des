package com.airlineBooking.controllers;

import java.net.http.HttpClient.Redirect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.airlineBooking.entities.AvailableAirlines;
import com.airlineBooking.entities.User;
import com.airlineBooking.services.AirlineAvailServices;
import com.airlineBooking.services.UserService;

import jakarta.persistence.EntityManager;

@Controller
public class Controllers {

	@Autowired
	private UserService userservice;
	
	@Autowired
	private AirlineAvailServices airlineservice;
	
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
	
	@GetMapping("/startingpoint")
	@ResponseBody
	public List<String> getListofStartingpoint()
	{
		
		List<String> states = userservice.getstates();
		return states;
		
	}
	
	@GetMapping("/destinationpoint")
	@ResponseBody
	public List<String> getListofDestinationpoint()
	{
		
		List<String> states = userservice.getstates();
		return states;
		
	}
	
	@RequestMapping("/searchflight")
	public ModelAndView searchFlight(@RequestParam("starting") String starting , 
			@RequestParam("destination") String destination,
			@RequestParam("date") String date , ModelAndView modelview) throws ParseException
	{
		System.out.println("date from request :  "+date);
		date = date+" 00:00:00 AM";
		Date date1 = new SimpleDateFormat("yyyy-MM-dd ").parse(date);
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//		//Calendar calendar = format.getCalendar();
//		
//		String date1 = format.format(date);
//		Date date2 = new SimpleDateFormat("yyyy-MM-dd ").parse(date);
		System.out.println("date after processing :  "+date1);
		List<AvailableAirlines> airlines = airlineservice.searchFlightService(starting, destination, date1);
		System.out.println("airlines : "+airlines);
		modelview.addObject("airlines",airlines);
		modelview.setViewName("searchflight");
		return modelview;
	}
	
	@RequestMapping("/adminform")
	public String adminform()
	{
		return "sample";
	}
	
	@RequestMapping("/adminSubmit")
	public void SubmitSample(@ModelAttribute AvailableAirlines avail_airlines)
	{
		System.out.println("here in admin submit");
		System.out.println("Data from the request  : " + avail_airlines);
		AvailableAirlines a = airlineservice.saveAirlines(avail_airlines);
		System.out.println("retunred object >>>>> "+a);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping("/getflight/{id}")
	public void getFlight(@PathVariable("id") String id)
	{
		
		System.out.println("FLight shown >>>>> ");
		Optional<AvailableAirlines> aa = airlineservice.getAirline(id);
		AvailableAirlines ab = aa.get();
		System.out.println("aa : "+ab);
		System.out.println((ab.getDate_time_arrival().getMonth()+1)+"~"+ab.getDate_time_arrival().getDate()+"~"+(ab.getDate_time_arrival().getYear()+1900));
		
	}
	
}

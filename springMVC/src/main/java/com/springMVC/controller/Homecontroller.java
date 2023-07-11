package com.springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("in function home..........");
		model.addAttribute("name","Sudhanshu Gupta");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("In help function...........");
		ModelAndView model_view = new ModelAndView();
		model_view.setViewName("help");
		model_view.addObject("helplineno","9817635241");
		model_view.addObject("helplineemail","helpline@gmail.com");
		List<String> friends = new ArrayList<String>();
		
		friends.add("Konark");
		friends.add("Nishant");
		friends.add("Rajat");
		model_view.addObject("friends",friends);
		return model_view;
	}
}

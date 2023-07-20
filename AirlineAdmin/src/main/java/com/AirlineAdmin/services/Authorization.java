package com.AirlineAdmin.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Admin.entities.User;
import com.AirlineAdmin.Dao.UserDao;

public class Authorization {

	public boolean authorize(String username , String password)
	{
		System.out.println("Authorizing user .............");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		UserDao userdao = context.getBean("userdao",UserDao.class);
		
		User user = userdao.getUser(username, password);
		
		if(user != null)
		{
			System.out.println("Pass");
			return true;
		}
		
		return false;
	}
	
	public void saveUser(User user)
	{
		System.out.println("Adding user .............");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		UserDao userdao = context.getBean("userdao",UserDao.class);
		
		userdao.saveUser(user);
		
		System.out.println("Adding user on to Dao  .............");
		
	}
}

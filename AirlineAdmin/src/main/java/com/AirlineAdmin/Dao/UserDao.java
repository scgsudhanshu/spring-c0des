package com.AirlineAdmin.Dao;

import java.util.Base64;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.Admin.entities.User;

public class UserDao {

	private HibernateTemplate hibernateTemplate;
	
	public User getUser(String username , String password)
	{
		SessionFactory factory = hibernateTemplate.getSessionFactory();
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(User.class);
		
		
		System.out.println("password before encoding : "+password);
		Base64.Encoder encoder = Base64.getEncoder();
		
		String encoded_pass = encoder.encodeToString(password.getBytes());  
        System.out.println("Encoded password : "+encoded_pass);
		
		criteria.add(Restrictions.eq("Username", username));
		criteria.add(Restrictions.eq("Password", encoded_pass));
		
		User user = (User) criteria.uniqueResult();
		System.out.println("User ->"+user);
		return user;
		
	}
	
	@Transactional
	public void saveUser(User user)
	{
		
		String password = user.getPassword();
		System.out.println("password before encoding : "+password);
		Base64.Encoder encoder = Base64.getEncoder();
		
		String encoded_pass = encoder.encodeToString(password.getBytes());  
        System.out.println("Encoded password : "+encoded_pass);
        
        user.setPassword(encoded_pass);
		
		try {
			this.hibernateTemplate.save(user);
		}
		catch(Exception e)
		{
			System.out.println("Exception >>>>>>>>>>> " +e);
		}
		System.out.println("Adding User Complete ..............");
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}

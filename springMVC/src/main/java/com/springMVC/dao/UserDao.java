package com.springMVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springMVC.model.Contact;

@Repository
public class UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public String insert(Contact contact)
	{
		String result = (String) hibernateTemplate.save(contact);
		return result;
	}
	
	
}

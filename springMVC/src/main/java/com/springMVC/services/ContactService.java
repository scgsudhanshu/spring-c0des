package com.springMVC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.UserDao;
import com.springMVC.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	UserDao userdao ;
	
	public String saveContact(Contact contact)
	{
		return userdao.insert(contact);
	}
}

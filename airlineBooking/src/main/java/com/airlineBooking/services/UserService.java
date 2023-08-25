package com.airlineBooking.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlineBooking.dao.UserDao;
import com.airlineBooking.entities.User;

@Component
public class UserService {

	@Autowired
	private UserDao userdao;

	public User saveUser(User user)
	{
		User user_saved = this.userdao.save(user);
		return user_saved;
	}
	
	public User getUser(int id)
	{
		Optional<User> user_get = this.userdao.findById(id);
		User user_ret = user_get.get();
		return user_ret;
	}
}

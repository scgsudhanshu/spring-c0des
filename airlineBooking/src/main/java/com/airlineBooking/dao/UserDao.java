package com.airlineBooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.airlineBooking.entities.User;

@Component
public interface UserDao extends CrudRepository<User,Integer> 
{

}

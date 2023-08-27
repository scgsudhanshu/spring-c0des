package com.airlineBooking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.airlineBooking.entities.User;

@Component
public interface UserDao extends CrudRepository<User,Integer> 
{
	@Query(value="SELECT DISTINCT region_name FROM MAS_AIRPORT",nativeQuery=true)
	public List<String> getStates();
}

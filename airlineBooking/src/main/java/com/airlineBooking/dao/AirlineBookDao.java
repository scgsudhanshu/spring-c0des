package com.airlineBooking.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.airlineBooking.entities.AvailableAirlines;
import com.airlineBooking.entities.User;

@Component
public interface AirlineBookDao extends CrudRepository<AvailableAirlines,String>
{
	@Query("select aa from AvailableAirlines aa where aa.region_from=:region_from and aa.region_to=:region_to and "
			+ "aa.date_time_departure=:date")
	public List<AvailableAirlines> getAirlinesfromParams(@Param("region_from") String region_from,
			@Param("region_to") String region_to ,@Param("date") Date  date);
}

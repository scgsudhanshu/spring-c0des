package com.airlineBooking.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airlineBooking.dao.AirlineBookDao;
import com.airlineBooking.entities.AvailableAirlines;

@Component
public class AirlineAvailServices {

	@Autowired
	private AirlineBookDao airlinedao;
	
	public List<AvailableAirlines> searchFlightService(String from , String to, Date date)
	{
		List<AvailableAirlines> airlines = airlinedao.getAirlinesfromParams(from,to,date);
		return airlines;
	}
}

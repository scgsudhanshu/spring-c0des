package com.airlineBooking.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
		System.out.println("Date : "+date);
		List<AvailableAirlines> airlines = airlinedao.getAirlinesfromParams(from,to,date);
		return airlines;
	}
	
	public AvailableAirlines saveAirlines(AvailableAirlines a)
	{
		System.out.println("In save service >>>>>>>>>>");
		AvailableAirlines b  = airlinedao.save(a);
		return b;
	}
	
	public Optional<AvailableAirlines> getAirline(String id)
	{
		Optional<AvailableAirlines> a = airlinedao.findById(id);
		return a;
	}
}

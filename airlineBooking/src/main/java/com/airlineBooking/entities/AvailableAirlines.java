package com.airlineBooking.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity()
@Table(name="tbl_available_airlines")
public class AvailableAirlines {
	
	@Id
	String Airline_No;
	String Airline_Name;
	
	String airport_from;
	
	String airport_to;
	String region_from;
	String region_to;
	int economy_seats;
	int business_seats;
	int first_class_seats;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	Date date_time_departure;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	Date date_time_arrival;
	String airport_from_id;
	String airport_to_id;
	
	public String getAirline_No() {
		return Airline_No;
	}
	public void setAirline_No(String airline_No) {
		Airline_No = airline_No;
	}
	public String getAirline_Name() {
		return Airline_Name;
	}
	public void setAirline_Name(String airline_Name) {
		Airline_Name = airline_Name;
	}
	public String getAirport_from() {
		return airport_from;
	}
	public void setAirport_from(String airport_from) {
		this.airport_from = airport_from;
	}
	public String getAirport_to() {
		return airport_to;
	}
	public void setAirport_to(String airport_to) {
		this.airport_to = airport_to;
	}
	public String getRegion_from() {
		return region_from;
	}
	public void setRegion_from(String region_from) {
		this.region_from = region_from;
	}
	public String getRegion_to() {
		return region_to;
	}
	public void setRegion_to(String region_to) {
		this.region_to = region_to;
	}
	public int getEconomy_seats() {
		return economy_seats;
	}
	public void setEconomy_seats(int economy_seats) {
		this.economy_seats = economy_seats;
	}
	public int getBusiness_seats() {
		return business_seats;
	}
	public void setBusiness_seats(int business_seats) {
		this.business_seats = business_seats;
	}
	public int getFirst_class_seats() {
		return first_class_seats;
	}
	public void setFirst_class_seats(int first_class_seats) {
		this.first_class_seats = first_class_seats;
	}
	public Date getDate_time_departure() {
		return date_time_departure;
	}
	public void setDate_time_departure(Date date_time_departure) {
		this.date_time_departure = date_time_departure;
	}
	public Date getDate_time_arrival() {
		return date_time_arrival;
	}
	public void setDate_time_arrival(Date date_time_arrival) {
		this.date_time_arrival = date_time_arrival;
	}
	public String getAirport_from_id() {
		return airport_from_id;
	}
	public void setAirport_from_id(String airport_from_id) {
		this.airport_from_id = airport_from_id;
	}
	public String getAirport_to_id() {
		return airport_to_id;
	}
	public void setAirport_to_id(String airport_to_id) {
		this.airport_to_id = airport_to_id;
	}
	public AvailableAirlines(String airline_No, String airline_Name, String airport_from, String airport_to,
			String region_from, String region_to, int economy_seats, int business_seats, int first_class_seats,
			Date date_time_departure, Date date_time_arrival, String airport_from_id, String airport_to_id) {
		super();
		Airline_No = airline_No;
		Airline_Name = airline_Name;
		this.airport_from = airport_from;
		this.airport_to = airport_to;
		this.region_from = region_from;
		this.region_to = region_to;
		this.economy_seats = economy_seats;
		this.business_seats = business_seats;
		this.first_class_seats = first_class_seats;
		this.date_time_departure = date_time_departure;
		this.date_time_arrival = date_time_arrival;
		this.airport_from_id = airport_from_id;
		this.airport_to_id = airport_to_id;
	}
	@Override
	public String toString() {
		return "AvailableAirlines [Airline_No=" + Airline_No + ", Airline_Name=" + Airline_Name + ", airport_from="
				+ airport_from + ", airport_to=" + airport_to + ", region_from=" + region_from + ", region_to="
				+ region_to + ", economy_seats=" + economy_seats + ", business_seats=" + business_seats
				+ ", first_class_seats=" + first_class_seats + ", date_time_departure=" + date_time_departure
				+ ", date_time_arrival=" + date_time_arrival + ", airport_from_id=" + airport_from_id
				+ ", airport_to_id=" + airport_to_id + "]";
	}
	
	
	
	
}

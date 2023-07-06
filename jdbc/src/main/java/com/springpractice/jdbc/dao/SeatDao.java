package com.springpractice.jdbc.dao;

import java.util.List;

// This interface has the functions for the implementation of the JDBC Methods

import com.springpractice.jdbc.entities.Seat;

public interface SeatDao {
	
	public int insert(Seat seat);
	public int update(Seat seat);
	public int delete(Seat seat);
	public Seat getSeat(String seatName);
	public List<Seat> getMultipleSeat();
}

package com.spring.jdbc.dao;
import java.util.List;

import com.spring.jdbc.entities.*;

public interface SeatDao {
	
	public int insert(Seat seat);
	public int change(Seat seat);
	public int delete(Seat seat);
	public Seat getSeat(String seatName); 
	public List<Seat> getAllSeats();
	
}

package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Seat;

public class SeatDaoImpl implements SeatDao {
	
	private JdbcTemplate jdbcTemplate;
	public int insert(Seat seat)
	{
		String query = "insert into voting_seatdetails values (?,?,?,?,?)";
		int r = this.jdbcTemplate.update(query , seat.getId() , seat.getSeatName() , seat.getState(),seat.getCurrent_MLA(),seat.getCurrent_MP());
		return r; 
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int change(Seat seat)
	{
		String query = "update voting_seatdetails set Current_MLA = ? , Current_MP = ? where seatName = ?";
		int r = this.jdbcTemplate.update(query , seat.getCurrent_MLA(),seat.getCurrent_MP(),seat.getSeatName());
		return r;
	}
	public int delete(Seat seat)
	{
		String query = "delete from voting_seatdetails where seatName = ?";
		int r = this.jdbcTemplate.update(query , seat.getSeatName());
		return r;
	}
	public Seat getSeat(String seatName) {
		// Selecting single seat
		
		RowMapper<Seat> rowMapper = new RowMapperImpl();
		String query = "select * from voting_seatdetails where SeatName = ? ";
		Seat seat = this.jdbcTemplate.queryForObject(query,rowMapper ,seatName);
		return seat;	
	}
	
	public List<Seat> getAllSeats()
	{
		// selecting multiple Seats
		String query = "select * from voting_seatdetails";
		List<Seat> seats = this.jdbcTemplate.query(query,new RowMapperImpl());
		return seats;
	}
	
	
}

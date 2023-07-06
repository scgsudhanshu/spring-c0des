package com.springpractice.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springpractice.jdbc.entities.Seat;

// This is the implementation class of the Seat Dao interface

@Component("seatImpl")

public class SeatDaoImpl implements SeatDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert(Seat seat) {
		System.out.println("Inserting the value for Seat......");
		String query = "insert into voting_seatdetails(SeatName, State, Current_MLA, Current_MP) values (?,?,?,?)";
		int result = this.jdbcTemplate.update(query,seat.getSeatName(),seat.getState(),seat.getCurrent_MLA(),seat.getCurrent_MP());
		return result;
	}


	@Override
	public int update(Seat seat) {
		// TODO Auto-generated method stub
		System.out.println("Updating Record...........");
		String query = "update voting_seatdetails set Current_MLA = ? where SeatName = ?";
		int result = this.jdbcTemplate.update(query,seat.getCurrent_MLA(),seat.getSeatName());
		return result;
	}


	@Override
	public int delete(Seat seat) {
		System.out.println("Deleting Record...........");
		String query = "delete from voting_seatdetails where SeatName = ?";
		int result = this.jdbcTemplate.update(query,seat.getSeatName());
		return result;
	}


	@Override
	public Seat getSeat(String seatName) {
		System.out.println("Selecting Seat with seatname : "+seatName+" .................");
		String query = "select * from voting_seatdetails where seatname = ?";
		RowMapper<Seat> rowMapper = new RowMapperImpl();
		Seat seat = this.jdbcTemplate.queryForObject(query,rowMapper,seatName);
		
		return seat;
	}


	@Override
	public List<Seat> getMultipleSeat() {
		System.out.println("Selecting Multiple Seats ....................");
		String query = "select * from voting_seatdetails";
		RowMapper<Seat> rowMapper = new RowMapperImpl();
		List<Seat> seats = this.jdbcTemplate.query(query,rowMapper);
		return seats;
	}
	
	
	

}

package com.springpractice.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springpractice.jdbc.entities.Seat;

public class RowMapperImpl implements RowMapper {

	@Override
	public Seat mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("Converting the ResultSet to Object ............");
		Seat seat = new Seat();
		seat.setId(rs.getInt(1));
		seat.setSeatName(rs.getString(2));
		seat.setState(rs.getString(3));
		seat.setCurrent_MLA(rs.getString(4));
		seat.setCurrent_MP(rs.getString(5));
		return seat;
	}
	
}

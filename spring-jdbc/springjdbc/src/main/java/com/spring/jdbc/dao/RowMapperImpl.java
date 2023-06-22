package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.spring.jdbc.entities.*;
import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Seat> {

	public Seat mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seat seat = new Seat();
		seat.setId(rs.getInt(1));
		seat.setSeatName(rs.getString(2));
		seat.setState(rs.getString(3));
		seat.setCurrent_MLA(rs.getString(4));
		seat.setCurrent_MP(rs.getString(5));
		return seat;
	}
	
	

}

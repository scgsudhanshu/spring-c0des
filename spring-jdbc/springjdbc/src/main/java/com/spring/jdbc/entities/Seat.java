package com.spring.jdbc.entities;

public class Seat 
{
	private int id;
	private String SeatName;
	private String State;
	private String Current_MLA;
	private String Current_MP;
	public Seat() {
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSeatName() {
		return SeatName;
	}



	public void setSeatName(String seatName) {
		SeatName = seatName;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public String getCurrent_MLA() {
		return Current_MLA;
	}



	public void setCurrent_MLA(String current_MLA) {
		Current_MLA = current_MLA;
	}



	public String getCurrent_MP() {
		return Current_MP;
	}



	public void setCurrent_MP(String current_MP) {
		Current_MP = current_MP;
	}



	@Override
	public String toString() {
		return "Seat [id=" + id + ", SeatName=" + SeatName + ", State=" + State + ", Current_MLA=" + Current_MLA
				+ ", Current_MP=" + Current_MP + "]";
	}
	
	
	
	
}

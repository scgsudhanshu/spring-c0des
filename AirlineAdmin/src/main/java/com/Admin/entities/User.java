package com.Admin.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="AirlineAdmin_User")
public class User {

	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int UserIndex;
	private String Username;
	private String Password;
	private String Fname;
	private String Mname;
	private String Lname;
	private String Email;
	
	public int getUserIndex() {
		return UserIndex;
	}
	public void setUserIndex(int userIndex) {
		UserIndex = userIndex;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
		
	@Override
	public String toString() {
		return "User [UserIndex=" + UserIndex + ", Username=" + Username + ", Password=" + Password + ", Fname=" + Fname
				+ ", Mname=" + Mname + ", Lname=" + Lname + ", Email=" + Email + "]";
	}
	
}

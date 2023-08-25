package com.airlineBooking.entities;

import java.util.Arrays;
import java.util.List;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Transient;

@Entity(name="tbl_book_user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String name;
	@Lob
	private byte[] user_img;
	
	private List<String> mobiles;
	private String email;
	private String rAddress;
	private boolean psamer;
	private String pAddress;
	private boolean passportchk;
	private String passport;
	private String aadharNo;
	private String password;
//	@Override
//	public String toString() {
//		return "User [userid=" + userid + ", name=" + name + ", mobiles=" + mobiles + ", email=" + email + ", rAddress="
//				+ rAddress + ", psamer=" + psamer + ", pAddress=" + pAddress + ", passportchk=" + passportchk
//				+ ", passport=" + passport + ", aadharNo=" + aadharNo + ", password=" + password + "]";
//	}
	
	
	public byte[] getUser_img() {
		return user_img;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", user_img=" + Arrays.toString(user_img) + ", mobiles="
				+ mobiles + ", email=" + email + ", rAddress=" + rAddress + ", psamer=" + psamer + ", pAddress="
				+ pAddress + ", passportchk=" + passportchk + ", passport=" + passport + ", aadharNo=" + aadharNo
				+ ", password=" + password + "]";
	}
	public void setUser_img(byte[] user_img) {
		this.user_img = user_img;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getrAddress() {
		return rAddress;
	}
	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}
	public boolean isPsamer() {
		return psamer;
	}
	public void setPsamer(boolean psamer) {
		this.psamer = psamer;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public boolean isPassportchk() {
		return passportchk;
	}
	public void setPassportchk(boolean passportchk) {
		this.passportchk = passportchk;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

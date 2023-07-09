package com.springORM.springORM.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_doctor")
public class Doctor {
	
	@Id
	
	int doctor_id;
	String doctor_name;
	String doctor_type;
	public int getdoctor_id() {
		return doctor_id;
	}
	public void setdoctor_id(int doctor_id) {
		doctor_id = doctor_id;
	}
	public String getdoctor_name() {
		return doctor_name;
	}
	public void setdoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getdoctor_type() {
		return doctor_type;
	}
	public void setdoctor_type(String doctor_type) {
		this.doctor_type = doctor_type;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Provider [Provider_id=" + doctor_id + ", provider_name=" + doctor_name + ", provider_type="
				+ doctor_type + "]";
	}
	public Doctor(int doctor_id, String doctor_name, String doctor_type) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_type = doctor_type;
	}
	
	
}

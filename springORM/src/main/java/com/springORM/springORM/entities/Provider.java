package com.springORM.springORM.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_provider_2")
public class Provider {
	
	@Id
	
	int Provider_id;
	String provider_name;
	String provider_type;
	public int getProvider_id() {
		return Provider_id;
	}
	public void setProvider_id(int provider_id) {
		Provider_id = provider_id;
	}
	public String getProvider_name() {
		return provider_name;
	}
	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}
	public String getProvider_type() {
		return provider_type;
	}
	public void setProvider_type(String provider_type) {
		this.provider_type = provider_type;
	}
	public Provider( int provider_id ,String provider_name, String provider_type) {
		super();
		Provider_id = provider_id;
		this.provider_name = provider_name;
		this.provider_type = provider_type;
	}
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Provider [Provider_id=" + Provider_id + ", provider_name=" + provider_name + ", provider_type="
				+ provider_type + "]";
	}
	
	
}

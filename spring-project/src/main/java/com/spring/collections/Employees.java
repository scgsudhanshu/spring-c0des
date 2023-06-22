package com.spring.collections;
import java.util.*;
public class Employees {
	String name;
	List<String> phones;
	Map<String , String> project;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getProject() {
		return project;
	}
	public void setProject(Map<String, String> project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", phones=" + phones + ", project=" + project + "]";
	}
	
	
	
}

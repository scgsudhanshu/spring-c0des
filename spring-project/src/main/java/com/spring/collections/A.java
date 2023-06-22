package com.spring.collections;

public class A 
{	int x;
	B ob;
	
	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		this.ob = ob;
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}

	
	
	
	

}

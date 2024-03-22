package com.demo.pojo;

public class testReq {

	private String name;
	private String lastName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public testReq(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	public testReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

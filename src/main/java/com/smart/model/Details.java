package com.smart.model;

public class Details {

	String name;
	String address;
	String marks;
	int rollNo;
	
	public Details() {
		
	}

	public Details(String name, String address, String marks, int rollNo) {

		this.name = name;
		this.address = address;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int string) {
		this.rollNo = string;
	}

}

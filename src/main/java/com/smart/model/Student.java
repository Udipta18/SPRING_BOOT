package com.smart.model;

public class Student {
	String name;
	int ID;
	String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

	/*
	 * public Student(String name, int iD, String college) {
	 * 
	 * this.name = name; this.ID = iD; this.college = college; }
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", college=" + college + "]";
	}

	
	
}

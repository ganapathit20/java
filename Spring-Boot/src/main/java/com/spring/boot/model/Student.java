package com.spring.boot.model;

public class Student {
	
	
	private int sNo;
	private String sName;
	private int rollNo;
	private String department;
	private String college;
	
//	public Student() {}
	
	public Student(int sNo, String sName, int rollNo, String department, String college) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.rollNo = rollNo;
		this.department = department;
		this.college = college;
	}

	public int getsNo() {
		return sNo;
	}

	public String getsName() {
		return sName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getDepartment() {
		return department;
	}

	public String getCollege() {
		return college;
	}
	
}

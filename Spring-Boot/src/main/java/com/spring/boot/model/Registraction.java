package com.spring.boot.model;

public class Registraction {
	
	private String name;
	private String email;
	private String mobileNo;
	private String uName;
	private String uPass;
	
	public Registraction(String name, String email, String mobileNo, String uName, String uPass) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.uName = uName;
		this.uPass = uPass;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getuName() {
		return uName;
	}

	public String getuPass() {
		return uPass;
	}
	
	

}

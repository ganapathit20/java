package com.spring.boot.model;

public class User {

	private String policyNo;
	private String date;
	
	public User() {}
	
	public User(String policyNo, String date) {
		super();
		this.policyNo = policyNo;
		this.date = date;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}

package com.casestudy.userprofileservice.common;

import org.springframework.data.mongodb.core.mapping.Field;

public class TransactionRequest {
	private  int uId;

	private String uName;

	private String Password;

	private String uAddress;
	
	private long mobile;
	
	private String email;
	public TransactionRequest() {
		
	}

	public TransactionRequest(int uId, String uName, String password, String uAddress, long mobile, String email) {
		super();
		this.uId = uId;
		this.uName = uName;
		Password = password;
		this.uAddress = uAddress;
		this.mobile = mobile;
		this.email = email;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

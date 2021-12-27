package com.casestudy.userprofileservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("User")
public class UserProfile {
	@Id
	private  int uId;
	@Field
	private String uName;
	@Field
	private String Password;
	@Field
	private String uAddress;
	@Field
	private long mobile;
	@Field
	private String email;
	

	
	public UserProfile()
	{
		
	}



	public UserProfile(int uId, String uName, String password, String uAddress, long mobile, String email) {
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
	
	
	
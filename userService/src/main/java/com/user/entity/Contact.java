package com.user.entity;

public class Contact {

	private Long cId;
	private String email ;
	private String contactName;
	
	private String userId;

	public Contact(Long cId, String email, String contactName, String userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
	
}

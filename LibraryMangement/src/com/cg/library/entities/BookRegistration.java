package com.cg.library.entities;

import java.sql.Date;

public class BookRegistration {

	private String registrationId;
	private String bookId;
	private String userId;
	private Date registrationDate;
	
	public String getRegistrationId() {
		return registrationId;
	}
	
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "BookRegistration [registrationId=" + registrationId
				+ ", bookId=" + bookId + ", userId=" + userId
				+ ", registrationDate=" + registrationDate + "]";
	}
	
	
	
	
}

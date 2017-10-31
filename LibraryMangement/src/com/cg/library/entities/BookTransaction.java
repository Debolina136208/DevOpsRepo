package com.cg.library.entities;

import java.sql.Date;

public class BookTransaction {
	
	private String transactionId;
	private String registrationId;
	private Date issueDate;
	private Date returnDate;
	private int fine;
	
	public String getRegistrationId() {
		return registrationId;
	}
	
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	public Date getIssueDate() {
		return issueDate;
	}
	
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	
	public Date getReturnDate() {
		return returnDate;
	}
	
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public int getFine() {
		return fine;
	}
	
	public void setFine(int fine) {
		this.fine = fine;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "BookTransaction [transactionId=" + transactionId
				+ ", registrationId=" + registrationId + ", issueDate="
				+ issueDate + ", returnDate=" + returnDate + ", fine=" + fine
				+ "]";
	}
	}
	
	



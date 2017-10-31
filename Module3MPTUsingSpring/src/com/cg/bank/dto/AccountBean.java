package com.cg.bank.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
public class AccountBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="account_number")
	private String accountNo;
	@Column(name="account_type")
	private String accountType;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="account_location")
	private String accountLocation;
	@Column(name="balance")
	private long balance;
	
	public AccountBean(String accountNo, String accountType,
			String customerName, String accountLocation, long balance) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountLocation = accountLocation;
		this.balance = balance;
	}
	
	public AccountBean() {
		super();
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAccountLocation() {
		return accountLocation;
	}
	
	public void setAccountLocation(String accountLocation) {
		this.accountLocation = accountLocation;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}

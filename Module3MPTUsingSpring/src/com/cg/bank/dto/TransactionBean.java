package com.cg.bank.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class TransactionBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="transaction_id")
	@SequenceGenerator(name="seq1",sequenceName="transaction_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq1")
	private long transId;
	@Column(name="transaction_description")
	private String transDesc;
	@Column(name="transaction_amount")
	private int transAmt;
	@Column(name="transaction_date")
	private Date transDate;
	@Column(name="account_number")
	private String accountNo;
	
	public TransactionBean(long transId, String transDesc, int transAmt,
			String accountNo) {
		super();
		this.transId = transId;
		this.transDesc = transDesc;
		this.transAmt = transAmt;
		this.accountNo = accountNo;
	}
	public TransactionBean() {
		super();
	}
	
	public long getTransId() {
		return transId;
	}
	
	public void setTransId(long transId) {
		this.transId = transId;
	}
	
	public String getTransDesc() {
		return transDesc;
	}
	
	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}
	
	public int getTransAmt() {
		return transAmt;
	}
	
	public void setTransAmt(int transAmt) {
		this.transAmt = transAmt;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public Date getTransDate() {
		return transDate;
	}
	
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
}

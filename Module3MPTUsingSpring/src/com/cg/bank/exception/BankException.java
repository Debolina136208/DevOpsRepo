package com.cg.bank.exception;

public class BankException extends Exception {
	/**
	 * 
	 */
	
	/*This is an Exception Class of our application OnlineBanking
	 * Using this we will handle all the other exceptions and display them in CustomerError.jsp
	 */
	
	private static final long serialVersionUID = 5631801796581035634L;

	public BankException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BankException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BankException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BankException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

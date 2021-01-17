package com.simplilearn.exceptionhandling.bank;

public class AccountNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	AccountNotFoundException(String message){
		this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}

	public String toString() {
		return " :::: Account Not Found Exception ::: " + message;
	}
	
}

package com.simplilearn.exceptionhandling.bank;

public class TransactionException extends Exception {
	
private static final long serialVersionUID = 1L;
	
	String message;
	
	TransactionException(String message){
		this.message = message;
	}

}

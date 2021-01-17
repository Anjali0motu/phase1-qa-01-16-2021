package com.simplilearn.exceptionhandling.bank;

public class BankTest {

	public static void main(String[] args) {

		Account account = new Account(101, "John Smith", 1000121);
		
		try {
			showBalance(account);
		} catch (AccountNotFoundException e) {
			System.out.println("Error Name :: "+e.getClass());
			System.out.println("Error Message :: "+e.getMessage());
		}

	}

	private static void depositAmount(Account account , double amount) throws TransactionException {
		if(amount >0 ) {
			account.balance = account.balance + amount;
			System.out.println("New Balance "+account.balance);
		} else {
			throw new TransactionException("Deposit Amount cannot be zero");
		}
	}

	private static void showBalance(Account account) throws AccountNotFoundException{
		if(account.accNo == 1066) {
			System.out.println("The Account name is :: "+account.name 
					+" with balance :: "+account.balance);
		} else {
			throw new AccountNotFoundException("Account does not exist as  "+account.accNo);
		}
	}

	private static void withdrawAmount(Account account , double amount) {

	}

}

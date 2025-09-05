package com.developer;

public class BankAccount {
	
	private int accountnum;
	private double balance;
	private String name;
	private int phone_number;
	public BankAccount(int accountnum, double balance, String name, int phone_number) {
		//super();
		this.accountnum = accountnum;
		this.balance = balance;
		this.name = name;
		this.phone_number = phone_number;
	}
	

	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("UIPDATED BALANCE: "+balance);
		
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance -= amount;
		}
		System.out.println("UIPDATED BALANCE: "+balance);
	}
	
	public String getAccountSummary() {
		return "ACCOUNT DETAILS: 1. ACCOUNTNUM : "+this.accountnum +"2. ACCOUNT HOLDER: "+this.name +"3. BALANCE : "+this.balance +"4. phone no."+this.phone_number;		
	}
	
	public double getBalance() {
		return balance;
	}

}

package com.developer;

public class BankAccount {
	
	private long accountNo;
	private String name;
	private long phoneNo;
	private double balance;
	
	
	public BankAccount(long accountNo, String name, long phoneNo, double balance) {
		//super();
		this.accountNo = accountNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance+= amount;
		System.out.println("Upadated Balance: "+balance);
		
	}
	
	public void withdraw(double amount) {
		
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Upadated Balance: "+balance+ "   Sucessfully Withdrawn");
			
		}else {
			System.out.println("Insuffient funds");
		}
		
	}

	public long getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		
		String str = "Account Details : \n";
		str+= "AccountNo. : "+this.accountNo+"\n";
		str+= "Name : "+ this.name+"\n";
		str+="PhoneNo.: "+this.phoneNo+"\n";
		str+="Balance : "+this.balance+"\n";
		
		return str;				
	}

}

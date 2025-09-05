package com.developer;

public class CurrentAccount extends BankAccount {
	
	private double overfitting=5000;

	public CurrentAccount(int accountnum, double balance, String name, int phone_number, int overfitting) {
		super(accountnum, balance, name, phone_number);
		this.overfitting = overfitting;
	}
	
	public void overfittingValue() {
		
	}
	public void withdraw(double amount) {
	}
}

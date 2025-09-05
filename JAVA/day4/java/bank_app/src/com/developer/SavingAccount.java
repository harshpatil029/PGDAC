package com.developer;

public class SavingAccount extends BankAccount{
	private int intrest= 7;

	public SavingAccount(int accountnum, double balance, String name, int phone_number, int intrest) {
		super(accountnum, balance, name, phone_number);
		this.intrest = intrest;
	}
	
	public void applyIntrest() {
		
	}
	
	
	public void withdraw(double amount) {
		if(amount>0 && amount<balance()) {
			double temp= super.getBalance();
			temp -= amount;
			System.out.println("UPDATED BALANCE: "+ temp);
		}
		else {
			System.out.println("Insufficient balance!!!! Amount:"+super.getBalance() );
		}
		
	}
	

}

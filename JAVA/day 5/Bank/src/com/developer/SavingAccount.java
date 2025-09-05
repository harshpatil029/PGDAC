package com.developer;

public class SavingAccount extends BankAccount {
	
	private static double roi = 6.00;
	private static double minBalance=5000.00;
	
	public SavingAccount(long accountNo, String name, long phoneNo, double balance) {
		super(accountNo, name, phoneNo, balance);
		
	}
	
	public void applyInterest() {
		
		double totalInterest= (super.getBalance() * roi )/100;
		super.setBalance(totalInterest);
		
	}
	
	@Override
	public void withdraw(double amount) {
		
		if(this.getBalance()>amount && this.getBalance()-amount>=minBalance) {
			
			this.setBalance(this.getBalance()-amount);
			
			System.out.println("Upadated Balance: "+this.getBalance()+ "   Sucessfully Withdrawn");
			
		}else {
			
			System.out.println("Cann't Withdraw minmium balance need to maintain");
		}
		
		
	}
	
	@Override
	public String toString() {
		
		String str = "Account Details :"+"\n";
		str+= "AccountNo. : "+super.getAccountNo()+"\n";
		str+= "Name : "+ super.getName()+"\n";
		str+="PhoneNo.: "+ super.getPhoneNo()+"\n";
		str+="Balance : "+super.getBalance()+"\n";
		str+= "Rate of Interest :"+ roi+"\n";
		
		return str;				
	}
	

}

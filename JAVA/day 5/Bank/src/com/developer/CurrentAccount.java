package com.developer;

public class CurrentAccount extends BankAccount{
	
	private double overdraft = 6000.00;
	
	public CurrentAccount(long accountNo, String name, long phoneNo, double balance) {
		super(accountNo, name, phoneNo, balance);
	
	}
	
	@Override
	public void withdraw(double amount) {
		
		if(amount<= this.getBalance()+overdraft && amount>0) {
			
			if(amount> this.getBalance()) {
				this.overdraft = ((this.getBalance()+this.overdraft)- amount);
				this.setBalance(0);
			}else {
				this.setBalance(this.getBalance()-amount);
			}	 
			System.out.println("Upadated Balance: "+this.getBalance()+ "  Overdraft Amount: "+this.overdraft+" Sucessfully Withdrawn");
			
		}else {
			
			System.out.println("Please enter valid amount");
		}
		
	}
	
	public void deposit(double amount) {
			
		if(this.getBalance()>0) {
			this.setBalance(this.getBalance()+amount);
		}
		else if(this.getBalance()==0 && this.overdraft==6000.00) {
			this.setBalance(this.getBalance()+amount);
		}
		else {
			double temp = 6000.00-overdraft;
			overdraft = overdraft + temp;
			amount = amount - temp;
			this.setBalance(this.getBalance()+amount);
		}
		
	}
	@Override
	public String toString() {
		
		String str = "Account Details : \n";
		str+= "AccountNo. : "+super.getAccountNo()+"\n";
		str+= "Name : "+ super.getName()+"\n";
		str+="PhoneNo.: "+ super.getPhoneNo()+"\n";
		str+="Balance : "+super.getBalance()+"\n";
		str+= "Overdraft Limit :"+ overdraft+"\n";
		
		return str;				
	}
//	
//	public void overdraftLimit() {
//		
//	}

}

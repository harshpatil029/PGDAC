package com.tester;

import java.util.Scanner;

import com.developer.BankAccount;
import com.developer.CurrentAccount;
import com.developer.SavingAccount;

public class TestBank {
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		BankAccount[] account = new BankAccount[3];
		account[0]=new SavingAccount(123456789, "Amar", 998877, 11000.00);
		account[1]=new CurrentAccount(123456701, "Akbar", 998876, 10000.00);
		account[2]=new SavingAccount(1234567801, "Anthony", 976655, 12000.00);
		for(BankAccount b : account) {
			System.out.println(b);
		}
//		System.out.println("Bank Options : 1: Open Saving Account 2: Open Saving Account 3: Open Saving Account 4:Exit");
		System.out.println("*********************************************");
		account[0].deposit(5000);
		account[1].withdraw(12000);
		account[1].deposit(5000);
		account[2].withdraw(5000);

		for(BankAccount b : account) {
			
			System.out.println(b);
		}
		
		
	}

}

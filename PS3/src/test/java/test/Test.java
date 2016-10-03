package test;

import java.text.DecimalFormat;
import base.Account;
import base.InsufficientFundsException;

public class Test {

	public static void main(String[] args) {

		DecimalFormat money = new DecimalFormat("$0,000.00");
		Account sample = new Account(1122, 20000.0);
		sample.setAnnualInterestRate(.045);

		try {
			sample.withdraw(2500.0);
		} catch (InsufficientFundsException e) {
			System.out.println("Stop that! You are short $" + e.getAmount());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Idk what happened lol");
			e.printStackTrace();
		}
		sample.deposit(3000.0);
		System.out.println("Balance: " + money.format(sample.getBalance()));
		System.out.println("Monthly Interest Rate: " + sample.getMonthlyInterestRate() * 100 + "%");
		System.out.println("Account Created on: " + sample.getDateCreated());
		try {
			sample.withdraw(2000000);
		} catch (InsufficientFundsException e) {
			System.out.println("Quit it, punk! You are short $" + e.getAmount());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Idk what happened lol");
			e.printStackTrace();
		}

	}

}
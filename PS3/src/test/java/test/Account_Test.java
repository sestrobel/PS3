package test;

import java.text.DecimalFormat;
import base.Account;
import base.InsufficientFundsException;
import static org.junit.Assert.*;
import org.junit.Test;

public class Account_Test {

	@Test
	public void a_Test() {
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

		assertTrue(sample.getBalance() == 17500);

		try {
			sample.deposit(3000.0);
		} catch (InsufficientFundsException e1) {
			System.out.println("Stop that! Deposit something more than zero!");
			e1.printStackTrace();
		}
		assertTrue(sample.getBalance() == 20500);

		try {
			sample.deposit(-10);
		} catch (InsufficientFundsException e1) {
			System.out.println("Stop that! Deposit something more than zero!");
			e1.printStackTrace();
		}
		assertTrue(sample.getBalance() == 20500);

		try {
			sample.withdraw(10000000000.0);
		} catch (InsufficientFundsException e) {
			System.out.println("Quit it, punk! You are short $" + e.getAmount());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Idk what happened lol");
			e.printStackTrace();
		}

		assertTrue(sample.getBalance() == 20500);

		System.out.println("Balance: " + money.format(sample.getBalance()));
		System.out.println("Monthly Interest Rate: " + sample.getMonthlyInterestRate() * 100 + "%");
		System.out.println("Account Created on: " + sample.getDateCreated());

	}
}

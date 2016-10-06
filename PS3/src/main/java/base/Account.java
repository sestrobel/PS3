package base;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated = new Date(); // needs default?

	public Account() {
		id = 0;
		balance = 0;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double amt) throws InsufficientFundsException {
		if (amt > this.balance ) {
			double needs = amt - this.balance;
			throw new InsufficientFundsException(needs, "You don't have that much money!");
		} else {
			this.balance -= amt; 
		}
		return;
	}

	public void deposit(double amt) throws InsufficientFundsException {
		if (amt <= 0) {
			throw new InsufficientFundsException("Deposit a positive amount!");
		} else {
			this.balance += amt; 
		}
		return;
	}
}

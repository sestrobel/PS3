package tests;

import base.Account;

public class Test {
	public void test() {

		Account sample = new Account(1122, 20000.0);
		sample.setAnnualInterestRate(.045);

		sample.withdraw(2500.0);
		sample.deposit(3000.0);
		System.out.println("Balance: " + sample.getBalance());
		System.out.println("Monthly Interest: " + sample.getMonthlyInterestRate());

	}
}
/*
 * package CISC181.Week3.Package4;
 * 
 * import static org.junit.Assert.*;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * 
 * public class CheckingAccountTest {
 * 
 * CheckingAccount c;
 * 
 * @Before public void setUp() throws Exception { c = new CheckingAccount(101);
 * }
 * 
 * @After public void tearDown() throws Exception { c = null; }
 * 
 * @Test(expected=InsufficientFundsException.class) public final void
 * testWithdraw() throws InsufficientFundsException { c.deposit(500.00);
 * assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500.
 * 00); c.withdraw(900); }
 * 
 * @Test public final void testDeposit() { int x = 0;
 * 
 * while (x < 20) { c.deposit(1000000000); } }
 * 
 * 
 * /*
 * 
 * @Test public final void testWithdraw() { fail("Not yet implemented"); // TODO
 * }
 * 
 * @Test public final void testGetBalance() { fail("Not yet implemented"); //
 * TODO }
 * 
 * @Test public final void testGetNumber() { fail("Not yet implemented"); //
 * TODO }
 *
 * 
 * }
 */
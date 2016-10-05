package base;

public class InsufficientFundsException extends Exception {
	
	private double amount;

	public InsufficientFundsException(double amount, String message) {
		super(message);
		this.amount = amount;
	}
	
	public InsufficientFundsException(String message) {
		super(message);
	}

	public double getAmount() {
		return amount;
	}
}

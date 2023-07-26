
public class CheckingAccount extends BankAccount {

	// create attributes
	private static final double FEE = .15;

	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");

	}

	
	//this is the method i need to fix!!! off by 14.85
	public boolean withdraw(double amount) {
		double total = amount + (FEE);
		return super.withdraw(total);

	}
}

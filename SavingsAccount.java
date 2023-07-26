
public class SavingsAccount extends BankAccount {

	// create attributes
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount) {
		super(name, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + (savingsNumber-1);

	}

	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + (savingsNumber);
	}

	public void postInterest() {
		double oneMonthRate = (rate/12);
		double oneMonthInt = oneMonthRate* getBalance();
		deposit(oneMonthInt);
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}

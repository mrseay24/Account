public class Account {
	protected double balance;

	public Account() {
		balance = 0;
	}

	public void setBalance(double amt) {
		balance += amt;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public void withDraw(double amt) {
		balance -= amt;
	}

	public void displayBalance() {
		System.out.println("Balance - " + balance);
	}
}

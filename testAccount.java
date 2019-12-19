import java.util.Scanner;

public class testAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Welcome. Which account do you want to create? \n 1. Normal \t 2. Savings");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		Account acct = null;
		if (choice == 1) {
			acct = new Account();
			System.out.println("New normal account created.");
			acct.displayBalance();
		} else if (choice == 2) {
			// Create savings account here by checking the initial balance
			acct = new SavingsAccount();
			while (true) {
				System.out.print("Enter initial balance: (>$50) - ");
				double bal = sc.nextDouble();
				if (bal > 50) {
					acct.setBalance(bal);
					acct.displayBalance();
					System.out.println("New savings account created.");
					break;
				}

				System.out.println("Balance should be greater than 50:");
			}
		}
		System.out.print("Enter the balance to deposit: ");
		double deposit = sc.nextDouble();
		acct.deposit(deposit);
		acct.displayBalance();

	}

	// Deposit money to account here

}

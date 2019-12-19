public class SavingsAccount extends Account{

	public SavingsAccount() {
	super();
	}
public void deposit(double amt){
	balance += amt + (.1 * amt);


}
}


public class CheckingAccount extends Account {

		public CheckingAccount(String n, int id, double balance) {
			super(n, id, balance);
		}
		
		public void draft(double amount, SavingsAccount savingsAccount) {
			if (getBalance() - amount < 0) {
				if (savingsAccount.getBalance() > amount) {
					setBalance(getBalance() - 50);
				}
				else {
					setBalance(getBalance() - 100);
				}
			}
		}
		public void lowBalance() {
			if (getBalance() < 20) {
				setBalance(getBalance() - 10);
			}
		}
		@Override
		public String toString() {
			return super.toString() + "\nAccount Type: Checking Account";
		}
	

}

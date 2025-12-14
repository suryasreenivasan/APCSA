
public class SavingsAccount extends Account {

    public SavingsAccount(String name, int id, double balance) {
        super(name, id, balance);
    }
    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Savings Account";
    }
}

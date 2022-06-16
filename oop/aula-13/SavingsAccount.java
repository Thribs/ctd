public class SavingsAccount extends Account {
    
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds");
            return;
        }
        setBalance(getBalance() - amount);
    }

    public void accrueInterest() {
        setBalance(getBalance() + getBalance() * 0.05);
    }
    
}

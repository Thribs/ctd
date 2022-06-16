public class CheckingAccount extends Account implements TaxDeductible {
    private double overdraftLimit = 0;

    public CheckingAccount(double drawLimit) {
        this.overdraftLimit = drawLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + overdraftLimit) {
            System.out.println("Insufficient funds");
            return;
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public void incurTax(Double percentage) {
        setBalance(getBalance() - getBalance() * percentage);
    }

}

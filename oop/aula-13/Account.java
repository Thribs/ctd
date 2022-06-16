public abstract class Account {
    private int id = newId();
    private double balance = 0;

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public abstract void withdraw(double amount);

    private static int newId() {
        return (int) (Math.random() * 100);
    }
}

        





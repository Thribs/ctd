

public class Client {
    private String firstName;
    private String lastName;
    private String id;
    private double balance;
    private double limit;
    
    public Client(String firstName, String lastName, String id, double limit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.limit= limit;
        balance=0;

    }
    public void buy(double amount)
    {
        balance+=amount;
    }
    public void payDebt(double amount)
    {
        balance-=amount;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                firstName + ' ' +
                lastName + ' ' +
                ", seu saldo é=" + balance + "R$ }";
    }
}
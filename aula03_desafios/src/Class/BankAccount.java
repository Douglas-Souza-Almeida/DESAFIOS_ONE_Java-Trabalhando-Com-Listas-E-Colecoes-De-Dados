package Class;

public class BankAccount {
    private String number;
    private double balance;

    public BankAccount (String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}

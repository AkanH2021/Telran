public class Account {
    private String iban;
    private double balance;

    private double basePercentage;

    public Account(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public double getBasePercentage() {
        return basePercentage = 15;
    }

    @Override
    public String toString() {
        return "iban='" + iban + ", old balance=" + balance + '}';
    }
}

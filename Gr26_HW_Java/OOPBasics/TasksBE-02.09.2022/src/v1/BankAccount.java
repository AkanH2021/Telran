package v1;

public class BankAccount {
    private Person person;
    private String IBAN;
    private double balance;

    public BankAccount(Person person, String IBAN, double balance) {
        this.person = person;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public String securedIBAN(String iban) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < getIBAN().length(); i++) {
            result.append((i < 4 || i > iban.length() - 3) ? iban.charAt(i) : '*');
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                getPerson() +
                ", IBAN='" + getIBAN() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}

public class Account {
    private Person client;
    private String IBAN;
    private double balance;

    public Account(Person client, String IBAN, double balance) {
        this.client = client;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        String personAccountInfo = client.toString() + " " + IBAN + " " + balance;
        return personAccountInfo;
    }

    public String secureToString(){
        StringBuilder newIBAN = new StringBuilder(IBAN);
        for (int i = 4; i < IBAN.length() - 2; i++) {
            newIBAN.setCharAt(i, '*');
        }
        return String.format("Client: %s; IBAN: %s; Balance %.2f; ", client, newIBAN, balance);
    }
}
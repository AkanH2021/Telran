import java.util.List;

public abstract class Customer {
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public double percentageAdding() {
        return getAccount().getBalance() * (1 + (getAccount().getBasePercentage()) / 100);
    }

    public static void printInfo(List<Customer> list) {
        for (Customer cust : list) {
            System.out.println(cust.toString() + ", new balance: " + cust.percentageAdding());
            System.out.println(cust.informing());
        }
    }

    public String informing() {
        return "inform by letter";
    }
}


import java.util.ArrayList;
public class Person extends BankAccountWithOwner {

    String name;
    ArrayList<BankAccount> accounts;

    public Person(String name, ArrayList<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }
}

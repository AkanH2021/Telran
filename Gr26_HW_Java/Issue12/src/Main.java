import java.util.ArrayList;
import java.util.List;

public class Main {
    /* Given a list of Person (String name, List<BankAccount> accounts) . BankAccount is the class with following fields:
    String iban, double balance. Create class BankAccountWithOwner (Person owner, String iban, double balance).
    Implement the method that returns the List of BankAccountWithOwner.    */

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("DE1234567890", 1500.00);
        BankAccount account2 = new BankAccount("DE0987654321", 2000.00);
        BankAccount account3 = new BankAccount("DE5987601234", 2500.00);
        BankAccount account4 = new BankAccount("DE3855685675", 3000.00);
        BankAccount account5 = new BankAccount("DE0899098790", 3500.00);
        BankAccount account6 = new BankAccount("DE1234523234", 4000.00);

        Person p1 = new Person("Ivan Ivanov", new ArrayList<>());
        Person p2 = new Person("Maria Ivanova", new ArrayList<>());
        Person p3 = new Person("Vasilisa Ivanova", new ArrayList<>());
        p1.accounts.add(account1);
        p1.accounts.add(account2);
        p2.accounts.add(account3);
        p2.accounts.add(account4);
        p3.accounts.add(account5);
        p3.accounts.add(account6);

        p1.printAccountOwners(p1);
        System.out.println("---");
        p2.printAccountOwners(p2);
        System.out.println("---");
        p3.printAccountOwners(p3);
    }
}

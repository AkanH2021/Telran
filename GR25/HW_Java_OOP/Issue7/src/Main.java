import java.util.Arrays;

public class Main {
    /*   Implement a simple bank app
       a. Create Person class with the following attributes (String firstName, String lastName). Write constructor,
       toString and getters methods.
        b. Create Account class with the following attributes String IBAN, Person client, double balance.
       Write constructor, toString and getters methods.
         c. Create BankProcessing class with an attribute Account[] bankAccounts. Write a constructor,
       which takes an array of Accounts as argument. Write toString method. Write the method witch return the
       array of all of the bank clients.
       d. In the Account class write secureToString method which works like normal toString but instead IBAN put
               in the result string something like DE45 *********35 (replaces all characters of IBAN string to char ‘’ except
       four first and two last characters).
       e. In the BankProcessing implement the secureToString method which displays the accounts using Account. secureToString method.
       f. In the BankProcessing implement the method which returns the sum of all accounts balances.
       */
    public static void main(String[] args) {

        Person client1 = new Person("Dima", "Bilan");
        Person client2 = new Person("Olga", "Buzova");

        Account account1 = new Account(client1, "DE451234567890", 2000.15);
        Account account2 = new Account(client2, "DE460987654321", 1815.26);
        account1.secureToString();

        System.out.println(account1);
        System.out.println(account2);

        Account[] bankAccounts = new Account[]{account1, account2};
        System.out.println(Arrays.toString(bankAccounts));
        System.out.println(Arrays.toString(bankAccounts));

        System.out.println(account1.secureToString());
        System.out.println(account2.secureToString());
    }

}
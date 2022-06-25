public class BankAccountWithOwner {
    private Person owner;
    private String iban;
    private double balance;


    void printAccountOwners(Person owner) {
        System.out.println(owner.getName() + " accounts:");
        for (BankAccount account : owner.accounts) {
            System.out.println("IBAN: " + account.getIban() + ", balance: " + account.getBalance() + "; ");
        }
    }
}

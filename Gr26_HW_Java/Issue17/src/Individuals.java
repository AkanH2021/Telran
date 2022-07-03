public class Individuals extends Customer {

    public Individuals(Account account) {
        super(account);
    }

    @Override
    public String toString() {
        return " Type: Individuals," + " account= " + super.getAccount();
    }
}

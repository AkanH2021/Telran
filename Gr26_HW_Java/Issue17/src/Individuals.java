public class Individuals extends Customer {

    public Individuals(Account account) {
        super(account);
    }

    @Override
    public double percentageAdding() {
        return super.percentageAdding();
    }

    public String informing() {
        return super.informing();
    }

    @Override
    public String toString() {
        return " Type: Individuals," + " account= " + getAccount();
    }
}

public class LegalEntities extends Customer {

    public LegalEntities(Account account) {
        super(account);
    }

    @Override
    public double percentageAdding() {
        if (getAccount().getBalance() >= 10000) {
            return super.percentageAdding();
        } else {
            return super.getAccount().getBalance();
        }
    }

    public String informing() {
        return super.informing();
    }

    @Override
    public String toString() {
        return " Type: LegalEntities," + " account= " + getAccount();
    }
}

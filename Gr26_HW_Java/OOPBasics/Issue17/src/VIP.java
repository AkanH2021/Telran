public class VIP extends Customer {

    private double bonus;

    public VIP(Account account) {
        super(account);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus = 2500;
    }

    @Override
    public double percentageAdding() {
        return super.percentageAdding() + getBonus();
    }

    @Override
    public String informing() {
        return "inform by letter and send email";
    }

    @Override
    public String toString() {
        return " Type: VIP," + " account= " + getAccount();
    }
}

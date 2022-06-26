public class Account {
    private String id;
    private double sum;

    public Account(String id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account: " + id + ", sum=" + sum;
    }
}

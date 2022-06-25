public abstract class Shop {
    private String name;
    private double price;
    private boolean discount;

    public Shop(String name, double price, boolean discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getDiscount() {
        return discount;
    }

    public double buy() {
        return price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price=" + buy() + '}';
    }
}



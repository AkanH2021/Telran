public abstract class Item {
    private String name;
    private double price;
    private boolean discount;

    private double percentage;

    public Item(String name, double price, boolean discount) {
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

    public double getDiscountPercentage() {
        return percentage;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice() * getDiscountPercentage() / 100);
    }

    public double buy() {
        return price;
    }

    public String toString() {
        return null;
    }

}



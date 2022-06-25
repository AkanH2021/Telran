public class Products extends Shop {

    public Products(String name, double price, boolean discount) {
        super(name, price, discount);
    }

    private double setDiscountPercentage() {
        return 30;
    }

    private double getDeliveryAdd() {
        return 5.0;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice()*setDiscountPercentage()/100);
    }

    @Override
    public double buy() {
        if (getDiscount()) {
            return setDiscountedPrice() + getDeliveryAdd();
        } else {
            return getPrice() + getDeliveryAdd();
        }
    }

    @Override
    public String toString() {
        return "Products: " + getName() + ": normal price: " + getPrice() + "; delivery: " + getDeliveryAdd() +
                "; discount: " + getDiscount()+ "; Total price: " + buy();
    }
}

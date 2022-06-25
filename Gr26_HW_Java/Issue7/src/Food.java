public class Food extends Item {

    public Food(String name, double price, boolean discount) {
        super(name, price, discount);
    }

    public double getDiscountPercentage() {
        return 30;
    }

    private double getDeliveryAdd() {
        return 5.0;
    }

    @Override
    public double buy() {
        if (getDiscount()) {
            return super.setDiscountedPrice() + getDeliveryAdd();
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

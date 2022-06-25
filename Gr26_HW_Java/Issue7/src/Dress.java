public class Dress extends Item {

    public Dress(String name, double price, boolean discount) {
        super(name, price, discount);
    }

    public double getDiscountPercentage() {
        return 30;
    }

    @Override
    public double buy() {
        if (getDiscount()) {
            return super.setDiscountedPrice();
        } else {
            return getPrice();
        }
    }

    @Override
    public String toString() {
        return "Products: " + getName() + ": normal price: " + getPrice() +
                "; discount: " + getDiscount()+ "; Total price: " + buy();
    }

}

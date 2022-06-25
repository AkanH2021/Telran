public class Dress extends Shop {

    public Dress(String name, double price, boolean discount) {
        super(name, price, discount);
    }

    private double setDiscountPercentage() {
        return 30;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice()*setDiscountPercentage()/100);
    }

    @Override
    public double buy() {
        if (getDiscount()) {
            return setDiscountedPrice();
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

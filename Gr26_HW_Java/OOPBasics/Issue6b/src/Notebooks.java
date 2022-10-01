public class Notebooks extends Electronics {

    public Notebooks(String name, double price, boolean discount, boolean warrantyAdd) {
        super(name, price, discount, warrantyAdd);
    }

    private double setDiscountPercentage() {
        return 10;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice() * setDiscountPercentage() / 100);
    }

    public double buy() {
        if (getDiscount() && getWarrantyAdd()) {
            return setDiscountedPrice() + getWarrantyPriceAdd();
        }
        if (getWarrantyAdd() && !getDiscount()) {
            return getPrice() + getWarrantyPriceAdd();
        }
        if (getDiscount() && !getWarrantyAdd()) {
            return setDiscountedPrice();
        } else {
            return getPrice();
        }
    }

    @Override
    public String toString() {
        return "Notebooks: " + getName() + ": price " + getPrice() + "; warranty: "
                + getWarrantyAdd() + "; discount: " + getDiscount() + "; Total price: " + buy();
    }
}

public class Notebooks extends Electronics {

    public Notebooks(String name, double price, boolean discount, boolean warrantyAdd) {
        super(name, price, discount, warrantyAdd);
    }

    public double getDiscountPercentage() {
        return 10;
    }

    public double buy() {
        if (getDiscount() && getWarrantyAdd()) {
            return super.setDiscountedPrice() + getWarrantyPriceAdd();
        }
        if (getWarrantyAdd() && !getDiscount()) {
            return getPrice() + getWarrantyPriceAdd();
        }
        if (getDiscount() && !getWarrantyAdd()) {
            return super.setDiscountedPrice();
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

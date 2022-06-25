public abstract class Electronics extends Item {
    private boolean warrantyAdd;

    public Electronics(String name, double price, boolean discount, boolean warrantyAdd) {
        super(name, price, discount);
        this.warrantyAdd = warrantyAdd;
    }

    public boolean getWarrantyAdd() {
        return warrantyAdd;
    }

    public double getWarrantyPriceAdd() {
        return 180.0;
    }

    @Override
    public double buy() {
        if (warrantyAdd) {
            return getPrice() + getWarrantyPriceAdd();
        } else {
            return getPrice();
        }
    }

    @Override
    public String toString() {
        return null;
    }
}

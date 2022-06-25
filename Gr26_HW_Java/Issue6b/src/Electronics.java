public abstract class Electronics extends Shop {
    private boolean warrantyAdd;
    private double percentage;

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

    private double setDiscountPercentage() {
        return 0;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice()*setDiscountPercentage()/100);
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

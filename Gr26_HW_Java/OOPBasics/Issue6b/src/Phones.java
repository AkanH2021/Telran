public class Phones extends Electronics {

    private boolean operatorContract;

    public Phones(String name, double price, boolean discount, boolean warrantyAdd, boolean operatorContract) {
        super(name, price, discount, warrantyAdd);
        this.operatorContract = operatorContract;
    }

      private double setDiscountPercentage() {
        return 35;
    }

    public double setDiscountedPrice() {
        return getPrice() - (getPrice() * setDiscountPercentage() / 100);
    }

   @Override
    public double buy() {
        double priceA = -1.0;
        if (!operatorContract) {
            return priceA;
        } else {
            if (getDiscount() && getWarrantyAdd()) {
                return setDiscountedPrice() + getWarrantyPriceAdd();
            }
            if (getWarrantyAdd() && !getDiscount()) {
                return getPrice() + getWarrantyPriceAdd();
            }
            if (getDiscount() && !getWarrantyAdd()) {
                return setDiscountedPrice();
            }
        }
        return getPrice() + getWarrantyPriceAdd();
    }

    @Override
    public String toString() {
        if (!operatorContract) {
            return "Can't sell phone without operatorContract!  " + "OperatorContract " + operatorContract;
        } else {
            return "Phones: " + getName() + ": price " + getPrice() + "; warranty: "
                    + getWarrantyAdd() + "; discount: " + getDiscount() + "; Total price: " + buy();
        }
    }

}


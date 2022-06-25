public class LuxuryHotel extends Hotel {

    public LuxuryHotel(String name, String roomType) {
        super(name, roomType);
    }

    public int getPrice() {
        int price = 0;
        if (roomType == singleRoom) {
            price = 200;
        }
        if (roomType == doubleRoom) {
            price = 250;
        }
        return price;
    }

    public String toString() {
        return super.toString() + getPrice() + " Eur";
    }

}

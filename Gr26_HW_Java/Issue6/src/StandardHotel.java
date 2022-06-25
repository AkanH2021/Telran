public class StandardHotel extends Hotel {

    public StandardHotel(String name, String roomType) {
        super(name, roomType);
    }

    public int getPrice() {
        int price = 0;
        if (roomType == singleRoom) {
            price = 100;
        }
        if (roomType == doubleRoom) {
            price = 150;
        }
        return price;
    }

    public String toString() {
        return super.toString() + getPrice() + " Eur";
    }

}

public class VIPHotel extends Hotel {
    public VIPHotel(String name, String roomType) {
        super(name, roomType);
    }

    public int getPrice() {
        int price = 0;
        if (roomType == singleRoom) {
            price = 300;
        }
        if (roomType == doubleRoom) {
            price = 350;
        }
        if (roomType == presidentRoom) {
            price = 400;
        }
        return price;
    }

    public String toString() {
        return super.toString() + getPrice() + " Eur";
    }

}
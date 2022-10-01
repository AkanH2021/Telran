public class Hotel {
    public String name;
    public String roomType;

    public String singleRoom;
    public String doubleRoom;
    public String presidentRoom;


    public Hotel(String name, String roomType) {
        this.name = name;
        this.roomType = roomType;
        this.singleRoom = "singleRoom";
        this.doubleRoom = "doubleRoom";
        this.presidentRoom = "presidentRoom";
    }

    @Override
    public String toString() {
        return "Hotel: " +name + "; room type is: " + roomType +
                "; price is " ;}
    }



public class HotelsMain {
    public static void main(String[] args) {
        Hotel standardSingle = new StandardHotel("Standard", "singleRoom");
        Hotel standardDouble = new StandardHotel("Standard", "doubleRoom");
        Hotel luxSingle = new LuxuryHotel("Lux", "singleRoom");
        Hotel luxDouble = new LuxuryHotel("Lux", "doubleRoom");
        Hotel vipSingle = new VIPHotel("Vip", "singleRoom");
        Hotel vipDouble = new VIPHotel("Vip", "doubleRoom");
        Hotel vipPresident = new VIPHotel("Vip", "presidentRoom");

        Hotel[] hotels = new Hotel[]{standardSingle, standardDouble, luxSingle, luxDouble, vipSingle, vipDouble, vipPresident};

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

}

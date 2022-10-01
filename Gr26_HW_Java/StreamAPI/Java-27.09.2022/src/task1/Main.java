package task1;

public class Main {
    //Создать ENUM
    public static void main(String[] args) {
        Compass.Directions cd1 = new Compass.Directions(Compass.NORTH);
        cd1.DirectionsInfoPrint();
        Compass.Directions cd2 = new Compass.Directions(Compass.SOUTH);
        cd2.DirectionsInfoPrint();
        Compass.Directions cd3 = new Compass.Directions(Compass.EAST);
        cd3.DirectionsInfoPrint();
        Compass.Directions cd4 = new Compass.Directions(Compass.WEST);
        cd4.DirectionsInfoPrint();
        Compass.Directions cd5 = new Compass.Directions(Compass.MIDDLE);
        cd5.DirectionsInfoPrint();

        }
    }
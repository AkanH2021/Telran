public class Car extends Vehicles{
    private int  loadingCapacity;
    private int passengerCapacity;

    public Car(String licensePlate, int year, int loadingCapacity, int passengerCapacity) {
        super(licensePlate, year);
        this.loadingCapacity = loadingCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " is able to carry " + getPassengerCapacity() +
                " passengers or has capacity of " + getLoadingCapacity() + " tonnes.");
    }
}

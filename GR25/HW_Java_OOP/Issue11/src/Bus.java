public class Bus extends Vehicles {
    private int passengerCapacity;

    public Bus(String licensePlate, int year, int passengerCapacity) {
        super(licensePlate, year);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " has capacity of  " + getPassengerCapacity() + " passengers.");
    }
}

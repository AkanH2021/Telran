public class Truck extends Vehicles {
    private double loadingCapacity;

    public Truck(String licensePlate, int year, double loadingCapacity) {
        super(licensePlate, year);
        this.loadingCapacity = loadingCapacity;
    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " has loading capacity of " + getLoadingCapacity() + " tonnes.");
    }
}
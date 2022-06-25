public abstract class Vehicles {
    private final String licensePlate;
    private final int year;

    public Vehicles(String licensePlate, int year) {
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "licensePlate='" + licensePlate + '\'' +
                ", year=" + year +
                '}';
    }

    public abstract void goToRace();
}
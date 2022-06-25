public class Car {
    String producer;
    String model;
    int year;
    String colour;

    public Car(String producer, String model, int year, String colour) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public void print(){
        System.out.println("Made by: " + producer + ", model: " + model + ", year: " + year + ", colour: " + colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}

package tasksLevel1.tasksLevel2;

import lombok.Getter;
import lombok.ToString;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Taycan", "Porsche", "Electric", "2019", "408");
        Car car2 = new Car("i4", "BMW", "Electric", "2021", "523");
        Car car3 = new Car("e-tron", "Audi", "Electric", "2019", "495");
        Car car4 = new Car("Model 3", "Tesla", "Electric", "2020", "443");
        Car car5 = new Car("Model S Plaid", "Tesla", "Electric", "2022", "1006");
        Car car6 = new Car("I-Pace", "Jaguar", "Electric", "2021", "394.26");
        Car car7 = new Car("Electric", "Mini", "Electric", "2022", "181");
        Car car8 = new Car("XC40 P8 AWD Recharge", "Volvo", "Electric", "2019", "402");
        Car car9 = new Car("ID.4", "Volkswagen", "Electric", "2021", "297");
        Car car10 = new Car("ix3", "BMW", "Electric", "2020", "282");

        List<Car> carList = List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        List<Car> cars;
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cars.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cars.bin"))) {
            outputStream.writeObject(carList);
            cars = new ArrayList<>((Collection<? extends Car>) inputStream.readObject());

        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Done");

        System.out.println(mapper(separator(cars)));
    }

    public static Map<String, Integer> mapper(String[] str) {
        return Arrays.stream(str)
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
    }

    public static String[] separator(List<Car> carList) {
        return carList.stream()
                .map(s -> s.getModel() + " " +
                        s.getName() + " " +
                        s.getClas() + " " +
                        s.getYear() + " " +
                        s.getHorsepower())
                .collect(Collectors.joining(" ")).split("[\\s,]+");
    }
}
@Getter
@ToString

class Car implements Serializable {
    private final String model;
    private final String name;
    private final String clas;
    private final String year;
    private final String horsepower;

    public Car(String model, String name, String clas, String year, String horsepower) {
        this.model = model;
        this.name = name;
        this.clas = clas;
        this.year = year;
        this.horsepower = horsepower;
    }
}




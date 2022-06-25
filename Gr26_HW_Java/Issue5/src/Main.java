public class Main {
    /* Создать класс автомобиль, у которого должны быть следующие поля - модель, год выпуска, цвет.
Создать метод печати, также создать в методе main несколько обьектов класса, положить их в массив и распечатать */
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes Benz", "EQB", 2022, "black");
        Car car2 = new Car("Audi", "A7", 2018, "white");
        Car car3 = new Car("Volkswagen", "Passat", 2008, "blue");
        Car car4 = new Car("Porsche", "Taycan 4S", 2022, "red");

        //    car1.print();
        //    car2.print();
        //    car3.print();
        //    car4.print();

        Car[] cars = new Car[]{car1, car2, car3, car4};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}

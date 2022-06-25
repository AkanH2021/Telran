import java.util.Arrays;

public class Main {
    /*1.создать классы содержащие методы для подсчета площади прямоугольника
     * квадарата и круга. Кроме результата подсчета должно выводиться также
     * название соответствующей фигуры. Создать массив таких обьектов и вывести
     * его на экран
     * Прямоугольник1 имеет площкдь 50
     * Круг имеет площадь 20 */
    public static void main(String[] args) {

        Shapes shape1 = new Rectangle("Rectangle", 2, 4);
        Shapes shape2 = new Square("Square", 2);
        Shapes shape3 = new Circle("Circle", 4, 3.14);

        Shapes[] shapes = new Shapes[] {shape1, shape2, shape3};

        for (Shapes shape : shapes) {
            System.out.println(shape);
        }
    }
}

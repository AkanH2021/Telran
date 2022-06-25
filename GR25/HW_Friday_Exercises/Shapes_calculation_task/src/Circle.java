public class Circle extends Shapes {
    private double radius;
    private double pi;
public Circle(String name, double radius, double pi) {
        super(name);
        this.radius = radius;
        this.pi = pi;
        }

public double getRadius() {
        return radius;
        }

public Object getArea() {
        return Math.pow(radius, 2) * 2 * pi;
        }

public String toString() {
        return super.toString();
        }

        }

public class Rectangle extends Shapes {
    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public Object getArea() {
        return getSideA()*getSideB();
    }

    public String toString() {
        return super.toString();
    }

}

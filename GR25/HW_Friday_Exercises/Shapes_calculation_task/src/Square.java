public class Square extends Shapes {

    private double sideA;

    public Square(String name, double sideA) {
        super(name);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public Object getArea() {
        return (getSideA() * getSideA());
    }

    public String toString() {
        return super.toString();
    }

}

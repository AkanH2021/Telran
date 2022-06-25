public class Shapes {
    private String name;

    public Shapes(String name) {
        this.name = name;
    }

    public Object getArea(){
        return null;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                getArea() +
                '}';
    }

}

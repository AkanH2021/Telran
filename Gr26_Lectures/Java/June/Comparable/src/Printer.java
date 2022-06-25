public class Printer implements Printable{
    String name;

    @Override
    public void print(String s) {
        System.out.println("My printer " + name + "start to print");
        System.out.println(s);
    }

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                '}';
    }
}

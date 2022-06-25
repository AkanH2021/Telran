public class Programmer extends Employee {

    private static double bonus = 0;

    public Programmer(String name, String position, double salary) {
        super(name, position, salary, bonus);
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " as " + getPosition() + " , my name is " + getName() + ", i make programs");
    }
}
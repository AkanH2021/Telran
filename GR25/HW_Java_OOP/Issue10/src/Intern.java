public class Intern extends Employee {

    private static double bonus = 0;

    public Intern(String name, String position, double salary) {
        super(name, position, salary, bonus);
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " as " + getPosition() + " , my name is " + getName());
    }

    public void doWork(){
        System.out.println(" i help my colleagues");
    }
}
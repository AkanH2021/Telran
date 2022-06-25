public class QAEngineer extends Employee {

    private static double bonus = 0;

    public QAEngineer(String name, String position, double salary) {
        super(name, position, salary, bonus);
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " as " + getPosition() + " , my name is " + getName() + ", i test programs");
    }
}
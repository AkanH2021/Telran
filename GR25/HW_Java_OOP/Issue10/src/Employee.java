public class Employee {
    private String name;
    private String position;
    private double salary;
    private double bonus;

    public Employee(String name, String position, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + position +
                " name='" + name + '\'' +
                ", salary = " + salary +
                '}';
    }

    public void getPaid() {
    }

    public void doWork(){
        System.out.println(" default work");
    }
}
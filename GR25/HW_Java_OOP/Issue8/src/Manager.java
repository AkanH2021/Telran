//Create a Manager class. Manager is the employee too. In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.

public class Manager extends Employee {

    public Manager(String name, String position, double salary, double bonus) {
        super(name, position, salary, bonus);
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}'
                + " bonus = " + getBonus();
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " + bonus "+ getBonus() + " as " + getPosition() + " , my name is " + getName() + ", i manage company");
    }
}
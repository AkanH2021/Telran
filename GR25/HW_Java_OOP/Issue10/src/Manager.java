//Create a Manager class. Manager is the employee too. In addition to the salary, the manager has a bonus.
// The getPaid method of Manager should consider the bonus.

import java.util.Arrays;

public class Manager extends Employee {
    private Employee[] team;
    private int capacity = 10;
    private int currentIndex = 0;

    public Manager(String name, String position, double salary, double bonus) {
        super(name, position, salary, bonus);
    }

    public Employee[] getTeam() {
        return team;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}'
                + " bonus = " + getBonus();
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " + bonus " + getBonus() + " as " + getPosition() + " , my name is " + getName());
    }

    public void doWork() {
        System.out.println(" i manage company");
    }

    public void addEmployeeToTeam(Employee e) {
        if (team == null) {
            team = new Employee[capacity];
            currentIndex = 0;
        } if (currentIndex>=capacity){
            Employee[] temp = new Employee[capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = team[i];
            }
            capacity*=2;
        }
        team[currentIndex++] = e;
        System.out.println(Arrays.toString(team));
    }
}

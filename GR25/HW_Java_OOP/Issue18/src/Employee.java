import java.util.Objects;

public abstract class Employee {
    private String name;
    private String surname;
    private double salary;


    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee %s %s [%.3f]",name,surname,salary);
    }

    public void getPaid(){

        System.out.println("I got the paid " + salary);
    }

    public  abstract void doWork();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && name.equals(employee.name) && surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }

    public int compareEmployee(Employee employee) {
        int res = this.name.compareTo(name);
        if (res==0) {
            res = this.surname.compareTo(surname);
        }
        return res;
    }
}
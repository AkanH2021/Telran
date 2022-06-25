public class Employee {
    String name;
    double salary;

    public void  work() {
        System.out.println("unknown work");
    };

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void paySalary(){
        System.out.println(name + ": I got my salary " + salary + " euro");
    }

    public double getSalary() {
        return salary;
    }

}

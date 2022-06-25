public class Programmer extends Employee{

    public Programmer(String name, double salary) {
        super(name,salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name +": I'am programmer. I write code.");
    }

    public void paySalary(){
        System.out.println(name + ": I got my salary " + salary);
    }

    public void setSalary(double salary) {
        if (this.salary < salary) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Programmer: " + name + "(" + salary + ")";
    }

}

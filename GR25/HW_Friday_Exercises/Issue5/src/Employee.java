public class Employee {

    private double salary;
    private int hoursPerDay;

    public Employee(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public double getSalary() {
        return salary;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public double addSalary() {
        return (salary <= 500) ? salary + 10 : salary;
    }

    public double addWork() {
        return (hoursPerDay > 6) ? 5 : 0;
    }

    public double totalPaid() {
        double total = addSalary() + addWork();
        return total;
    }

}
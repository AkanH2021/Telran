public class Programmer extends Employee{

    public Programmer (String name, double salary) {
        super(name,salary);
    }


    public Programmer(String name) {
        this(name, 3000);
    }
    public void work() {
        System.out.println(getName() +": I'am programmer. I write code.");
    }

    public void paySalary(){
        System.out.println(getName() + ": I got my salary " + getSalary());
    }

 //  public void setSalary(double salary) {
 //       if (this.getSalary() < salary) {
 //           this.salary=salary;
 //       }
 //   }

    @Override
    public String toString() {
        return "Programmer: " + getName() + "(" + getSalary() + ")";
    }

}

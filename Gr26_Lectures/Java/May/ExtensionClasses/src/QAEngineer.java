public class QAEngineer extends Employee{
    boolean giraSkills;

       public QAEngineer(String name, double salary, boolean giraSkills) {
           super(name,salary);
           this.giraSkills=giraSkills;
    }


    public String toString() {
        return "QAENgineer: " + name + "(" + salary + ")";
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name +": I'am QA Engineer. I check programs.");
    }

    public void paySalary(){
        System.out.println(name +": I got my salary " + salary);
    }
}

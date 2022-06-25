public class QAEngineer extends Employee{
    boolean giraSkills;

       public QAEngineer(String name, double salary, boolean giraSkills) {
           super(name,salary);
           this.giraSkills=giraSkills;
    }

    public String toString() {
        return "QAENgineer: " + getName() + "(" + getSalary() + ")";
    }

   public void work() {
        System.out.println(getName() +": I'am QA Engineer. I check programs.");
    }

    public void paySalary(){
        System.out.println(getName() +": I got my salary " + getSalary());
    }
}

public class QAEngineer extends Employee{
    public QAEngineer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public  void doWork(){
        System.out.println("I am QA Engineer " + getName()+ " I check the program");
    }

    @Override
    public String toString() {
        return super.toString() +" QAEngineer";
    }

}

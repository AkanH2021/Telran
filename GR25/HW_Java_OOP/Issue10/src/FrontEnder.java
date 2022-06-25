public class FrontEnder extends Programmer{
    public FrontEnder(String name, String position, double salary) {
        super(name, position, salary);
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " as " + getPosition() + " , my name is " + getName());
    }

    public void doWork(){
        System.out.println(" Write code and Implement new features");
    }
}
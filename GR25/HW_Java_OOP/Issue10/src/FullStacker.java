public class FullStacker extends Programmer {
    public FullStacker(String name, String position, double salary) {
        super(name, position, salary);
    }

    public void getPaid() {
        System.out.println("I got paid " + getSalary() + " as " + getPosition() + " , my name is " + getName());
    }

    public void doWork() {
        super.doWork();
    }
}
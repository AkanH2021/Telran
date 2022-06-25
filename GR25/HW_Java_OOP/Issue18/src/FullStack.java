public class FullStack extends Programmer{
    public FullStack(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public void doWork() {
        System.out.println("I am programmer " + getName());
    }
}
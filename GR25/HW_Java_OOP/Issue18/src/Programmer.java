public abstract class Programmer extends Employee {

    public Programmer(String name, String surname,  double salary) {
        super(name, surname, salary);
    }

    /*
            public void doWork() {
                System.out.println("I am programmer " + getName() + " I write program");
            }
        */
    @Override
    public String toString() {
        return super.toString() +" Programmer";
    }
}
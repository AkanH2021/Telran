public class FrontEndProgrammer extends Programmer {
    public FrontEndProgrammer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    public String toString(){
        return super.toString();
    }
    public void doWork() {
        System.out.println("I am FrontEnd programmer" + getName() + " I make FrontEnd");
    }

}
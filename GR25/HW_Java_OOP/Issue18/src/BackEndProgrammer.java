public final class BackEndProgrammer extends Programmer {

    public BackEndProgrammer(String name, String surname, double salary) {
        super(name,surname, salary);
    }

    public void doWork() {
        System.out.println("I am BackEnd programmer" + getName() + " I make super system!");
    }

}

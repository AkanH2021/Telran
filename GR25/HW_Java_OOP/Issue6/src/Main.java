public class Main {

    public static void main(String[] args) {
        MyDate mydate = new MyDate(21, 12, 2022);
        MyDate dateStart = new MyDate(22, 12, 2022);
        MyDate dateFinish = new MyDate(22, 3, 2023);

        Person person = new Person("Ivan", "Ivanov", mydate);
        PracticePersons trainee = new PracticePersons("Dima", "Bilan");
        PracticePersons tutor = new PracticePersons("Olga", "Buzova");

        Practice practice = new Practice("Math", trainee, tutor, dateStart, dateFinish);
        System.out.println(mydate);
        System.out.println(person);
        System.out.println(practice);
    }

}
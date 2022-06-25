public class Main {

    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ivan", "Programmer", 1000.00);
        Programmer p2 = new Programmer("Nick", "Programmer", 1500);
        QAEngineer q1 = new QAEngineer("Lena", "QAEngineer", 1200);
        QAEngineer q2 = new QAEngineer("Max", "QAEngineer", 1100);
        Intern i1 = new Intern("Vasya", "Intern", 1200);
        Manager m1 = new Manager("Dima", "Manager", 3000, 500);

        Employee[] employee = {p1, p2, q1, q2, i1, m1};
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            employee[i].getPaid();
        }
    }
}
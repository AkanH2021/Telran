public class Main {
//   Let’s improve our employee project. Let’s add several type of programmers: BackEnd programmer, FrontEnd programmer and FullStack.
//   All type of programmers should doWork() but BackEnd programmers should “Write code and improve backend”, FrontEnd programmers should
//   “Write code and Implement new features”. The work of FullStack programmers not defined.

//   Add to Manager field team. It must contain an array of Employee. You should not initialize it from constructor.
//   You should implement the method addEmployeeToTeam that takes an Employee and add to team.

    public static void main(String[] args) {
        Programmer p1 = new Programmer("Ivan", "Programmer", 1000.00);
        Programmer p2 = new Programmer("Nick", "Programmer", 1500);
        QAEngineer q1 = new QAEngineer("Lena", "QAEngineer", 1200);
        QAEngineer q2 = new QAEngineer("Max", "QAEngineer", 1100);
        BackEnder b1 = new BackEnder("Vika", "Backend", 1400);
        BackEnder b2 = new BackEnder("Petya", "Backend", 1400);
        FrontEnder fe1 = new FrontEnder("Marina", "FE developer", 1400);
        FrontEnder fe2 = new FrontEnder("Irina", "FE developer", 1400);
        FullStacker fs1 = new FullStacker("Illarion", "Fullstacker", 1550);
        FullStacker fs2 = new FullStacker("Kuzma", "Fullstacker", 1550);

        Intern i1 = new Intern("Vasya", "Intern", 1200);
        Manager m1 = new Manager("Dima", "Manager", 3000, 500);

        Employee[] employee = {p1, p2, q1, q2, i1, m1, b1, b2, fe1, fe2, fs1, fs2};
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            employee[i].getPaid();
            employee[i].doWork();
        }

        m1.addEmployeeToTeam(q1);
        m1.addEmployeeToTeam(q2);
    }
}
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Intern intern1 = new Intern("Intern", "Internovich", 500);
        Employee intern2 = new Intern("Intern2", "Internovich2", 501);
        //Programmer inte4=new Intern("InternInternovich2",501);
        //Employee intern3 = new Employee("programmer",1000);

        intern1.qwe();
        ((Intern) intern2).qwe();  // Операция (type)variableName  это операция принудительного изменения типа переменной,
        // приведение переменной variableName к типу type

    /*
        intern1.note="Intern1";
        Intern intern5=intern1;    // !! intern1 and intern2 are the same object
        intern5.note="intern5";
        System.out.println("Intern1: "+intern1);
        System.out.println("Intern5: "+intern5);
     */
        //child   " is a " parent

        FrontEndProgrammer p1 = new FrontEndProgrammer("Ivan", "Mihailov", 1000);
        BackEndProgrammer p2 = new BackEndProgrammer("Nick", "Nikolaev", 1500);
        QAEngineer q1 = new QAEngineer("Lena", "ivanova", 1200);
        QAEngineer q2 = new QAEngineer("Max", "Petrov", 1100);

        Employee[] employee = {p1, p2, q1, q2,
                new Intern("Jack", "Vorobey", 200),
                new Manager("Olga", "Borisova", 3000, 2000)
        };
        //Employee employee1 = new Employee("qwe",45);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            employee[i].getPaid();
            employee[i].doWork();
        }

        System.out.println("--------------------------");
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Ron", "Ronsn", 7000);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Neron", "Neronovich", 6000);

        Employee[] employees = new Employee[]{p1, p2, q1, q2, intern1, intern2,};
        Arrays.sort(employees);


        backEndProgrammer.doWork();
        frontEndProgrammer.doWork();
        backEndProgrammer.getPaid();
        frontEndProgrammer.getPaid();

        System.out.println("----- Manager ----");
        Manager m = new Manager("SuperBoss", "MegaBoss",5000,1000 );
        m.addToTeam(q1);
        m.addToTeam(q2);
        m.addToTeam(p1);
        m.addToTeam(p2);
        m.addToTeam(intern1);
        m.printTeam();
        m.removeFromTeam(2,true);
        System.out.println("------------- после удаления --------");
        m.printTeam();

        System.out.println("----------- удаление через employee");
        EmployeeTeam team= new EmployeeTeam(100);

        BackEndProgrammer p100=new BackEndProgrammer("Nick", "Petrov", 1500);
        m.removeFromTeam(p100);
        m.printTeam();

        //System.out.println(Arrays.toString(m.team));
    }
}
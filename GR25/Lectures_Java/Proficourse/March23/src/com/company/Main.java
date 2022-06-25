package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer p1=new Programmer("Ivan",1000);
        Programmer p2=new Programmer("Nick",1500);
        QAEngineer q1=new QAEngineer("Lena",1200);
        QAEngineer q2=new QAEngineer("Max",1100);
        Intern intern = new Intern("InternIvanovich", 500);
        Employee intern2 = new Intern("InternInternovich2", 501);
        Manager manager = new Manager("Olga", 3000, 2000);


        Employee[] employee = {p1, p2, q1, q2, manager,
                new Intern("Jack", 200),
        new Manager("Olga", 3000, 2000)
            };

                for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            employee[i].getPaid();
            employee[i].doWork();

        }

    }
}
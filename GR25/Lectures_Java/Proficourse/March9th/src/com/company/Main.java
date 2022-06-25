package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ivan Ivanov";
        student1.rates = new int[]{3, 2, 4, 5};

        Student student2 = new Student();
        student2.name = "Pavel Pavlov";
        student2.rates = new int[]{3, 5, 3, 4, 3, 3, 5};

        Student[] students = {student1, student2};
        for (int i = 0; i < students.length; i++) {
            printStudent(students[i]);
        }
        System.out.println(student1);

        printStudent(student1);
        printStudent(student2);
    }

    public static void printStudent(Student student) {
        System.out.println(student.name);
        System.out.println("rates: ");
        for (int i = 0; i < student.rates.length; i++) {
            System.out.println(student.rates[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

}


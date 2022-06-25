package com.company;

public class Intern extends Employee{

    public Intern(String name, double salary) {
        super(name, salary);
        System.out.println("Constructor Intern");
    }

    @Override
    public String toString() {
        return super.toString() + " intern";
    }
}

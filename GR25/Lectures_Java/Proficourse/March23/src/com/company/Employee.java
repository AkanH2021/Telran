package com.company;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("constructor Employee");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee %s [%.2f]", name, salary);
    }

    public void getPaid(){
        System.out.println("I got the paid " + salary);
    }

    public void doWork(){
        System.out.println("default work");
    }

}
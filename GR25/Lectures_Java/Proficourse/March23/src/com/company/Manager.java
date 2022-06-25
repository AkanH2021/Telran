package com.company;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void doWork() {

        System.out.println("I am manager " + getName() + " I get highest salary");
    }

    @Override
    public String toString() {
        return super.toString() + " Manager";
    }

    @Override
    public void getPaid(){
        double paid = super.getSalary() + bonus;
        String str = String.format(" i got paid %.2f [ salary: %.2f bonus %.2f]", + paid, getSalary(), getBonus());
        System.out.println(str);
    }

}

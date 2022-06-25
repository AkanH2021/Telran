package com.company;

public class Dog {
    private String name;
    private int age;
    private static int count;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }

    public static int getCount() {
        return count;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age cannot ne negative");
        else {
            this.age = age;
        }
    }

    public String toString(){
        return "name= " + name + ", "+"age="+age;
    }
}

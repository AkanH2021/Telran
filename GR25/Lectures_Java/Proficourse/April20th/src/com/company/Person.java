package com.company;

public class Person {
    String name;

    public Person(){};

    public Person(String name){
        this.name = name;
    }

    static Person getPerson(String qwetryu){
        System.out.println("Let's create a Person");
        return new Person(getPerson("qwetryu").name);
    }



}

package com.company;

public class Main {

    public static void main(String[] args) {
        Person pavel = buildPerson(1, "Pavel");
        System.out.println(pavel);

            }

            private static Person buildPerson(Integer id, String  name) {

        return new Person(id, name);
            }
}

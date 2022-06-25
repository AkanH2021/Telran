package com.company;

public class Person {

    String firstName;
    String lasttName;
    MyDate birthday;

    public Person (String firstName, String lasttName, MyDate birthday) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.birthday = birthday;
    }

    public String toString() {
      return (this.firstName + " " + this.lasttName + " [" + this.birthday.toString() + "]");
    }
}

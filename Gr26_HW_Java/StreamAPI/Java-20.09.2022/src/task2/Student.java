package task2;

public class Student {
    private String firstName;
    private String surName;
    private int age;

    public Student(String firstName, String surName, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student:{" + firstName + " " + surName + ", age: " + age + '}';
    }
}

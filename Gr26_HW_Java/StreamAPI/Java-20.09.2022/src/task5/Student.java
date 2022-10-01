package task5;

public class Student {
    private String firstName;
    private char gender;
    private int age;
    private int course;
    private Double rate;

    public Student(String firstName, char gender, int age, int course, Double rate) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.rate = rate;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public Double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", rate=" + rate +
                '}';
    }
}

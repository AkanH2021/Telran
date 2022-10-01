package task5a;

import java.util.Arrays;

public class Faculty {
    private String name;
    private Student[] allStudents;
    private int capacity = 2;
    private int currentIndex = 0;

    public Faculty(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student[] getAllStudents() {
        return allStudents;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    @Override
    public String toString() {
        return "Student{" + Arrays.toString(allStudents) + '}';
    }

    public void print() {
        System.out.print("Team: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(i + ": " + allStudents[i] + "   ");
        }
        System.out.println();
    }

    public void addStOnF(Student student) {
        if (allStudents == null) {
            allStudents = new Student[capacity];
            currentIndex = 0;
        }
        if (currentIndex >= capacity) {
            capacity *= 2;
            allStudents = Arrays.copyOf(allStudents, capacity);
        }
        allStudents[currentIndex++] = student;
    }

}

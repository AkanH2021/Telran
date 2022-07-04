package Task2;

public class Student  {
    private String name;
    private int tasksDone;

    public Student(String name, int tasksDone) {
        this.name = name;
        this.tasksDone = tasksDone;
    }

    public int getTasksDone() {
        return tasksDone;
    }

    public String toString() {
        return "Student name: " + name + ", tasksDone: " + tasksDone + System.lineSeparator();
    }
}


package hw8thSeptember;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    /*  2. Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист
    имеет список задач Task (int Number, String description, String status, int daysInProcessing).
              Сформировать лист из десяти задач которые дольше всего находятся в работе.*/
    public static void main(String[] args) {
        Task task1 = new Task(101, "hw8thSeptember/09/2022", "done", 7);
        Task task2 = new Task(102, "task2", "undone", 4);
        Task task3 = new Task(103, "task3", "done", 8);
        Task task4 = new Task(104, "task4", "undone", 3);
        Task task5 = new Task(105, "task5", "done", 7);
        Task task6 = new Task(106, "task6", "undone", 4);
        Task task7 = new Task(107, "task7", "done", 8);
        Task task8 = new Task(108, "task8", "undone", 10);
        Task task9 = new Task(109, "task9", "undone", 6);
        Task task10 = new Task(110, "task10", "undone", 16);
        Task task11 = new Task(111, "task11", "undone", 12);


        List<Task> taskList1 = List.of(task1, task3, task5);
        List<Task> taskList2 = List.of(task2, task4, task6, task11);
        List<Task> taskList3 = List.of(task7, task8, task9, task10);

        Programmer p1 = new Programmer("Jack", "Berlin", taskList1);
        Programmer p2 = new Programmer("John", "Hamburg", taskList2);
        Programmer p3 = new Programmer("Maria", "Berlin", taskList3);

        List<Programmer> codersList = List.of(p1, p2, p3);

        System.out.println(task2HW(codersList));

    }

    public static List<Task> task2HW(List<Programmer> plist) {
        List<Task> resList = plist.stream()
                .filter(s -> s != null)
                .flatMap(p -> p.getTasks().stream())
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing).reversed())
                .limit(10)
                .collect(Collectors.toList());
        return resList;
    }

}
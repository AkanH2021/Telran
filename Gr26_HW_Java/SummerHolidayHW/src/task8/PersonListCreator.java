package task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonListCreator extends PersonCreator {

    public static List<Person> createList() {
        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("Please enter: yes to create new user or: finish to exit program): ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            if (choice.equalsIgnoreCase("finish")) {
                sc.close();
                break;
            } else {
                if (choice.equalsIgnoreCase("yes")) {
                    people.add(PersonCreator.createPerson());
                }
            }
        }
        return people;
    }

    public static void printList(List<Person> people) {
        Collections.sort(people);
        for (Person p : people) {
            System.out.println("Name: " + p.getName() + "; birthday: " + p.getBirthday());
            System.out.println();
        }
    }

}

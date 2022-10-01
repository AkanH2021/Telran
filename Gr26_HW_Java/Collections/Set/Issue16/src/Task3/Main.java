package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Дано несколько списков User-ов{fFame, lName, email}, необходимо написать метод, который подготовит
        список всех email-ов для рассылки */

        Users user1 = new Users("Михаил", "Михайлов", "mihail@email.com");
        Users user2 = new Users("Nikolay", "Nikolaev", "nikolay@email.com");
        Users user3 = new Users("Fedor", "Fedorov", "fedor@email.com");
        Users user4 = new Users("Александр", "Александров", "alexander@email.com");
        Users user5 = new Users("Ivan", "Ivanov", "ivan@email.com");
        Users user6 = new Users("Petr", "Petrov", "petr@email.com");
        Users user7 = new Users("Fedor", "Mihaylov", "fedor2022@email.com");
        Users user8 = new Users("Fedor", "Ivanov", "fedor@email.com");  //repeating email like user 3
        Users user9 = new Users("Vladimir", "Zelenski", "zelensky@email.com");

        List<Users> usersList1 = new ArrayList<>();
        usersList1.add(user1);
        usersList1.add(user2);
        usersList1.add(user3);

        List<Users> usersList2 = new ArrayList<>();
        usersList2.add(user4);
        usersList2.add(user5);
        usersList2.add(user6);

        List<Users> usersList3 = new ArrayList<>();
        usersList3.add(user7);
        usersList3.add(user8);
        usersList3.add(user9);

        List<Users> unifiedUsers = new ArrayList<>();
        unifiedUsers.addAll(usersList1);
        unifiedUsers.addAll(usersList2);
        unifiedUsers.addAll(usersList3);

        System.out.println(emailsGetting(unifiedUsers));

    }

    public static Set<String> emailsGetting(List<Users> usersList) {
        Set<String> userEmailSet = new HashSet<>();
        for (Users user : usersList) {
            userEmailSet.add(user.getEmail());
        }
        return userEmailSet;
    }

}
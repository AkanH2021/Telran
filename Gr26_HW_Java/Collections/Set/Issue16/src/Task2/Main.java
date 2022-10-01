package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* 2.  ƒан список User<name, email>, необходимо написать метод, который определит, есть ли в списке дубли. */
        User user1 = new User("Mihail", "mihail@email.com");
        User user2 = new User("Nikolay", "nikolay@email.com");
        User user3 = new User("Fedor", "fedor@email.com");
        User user4 = new User("Fedor", "fedor12@email.com");  //test user with same name as user3 - testing for repeating name;
        User user5 = new User("Nikolay", "fedor@email.com"); //test user with same name&email as user3 - testing for repeating name & email;

        List<User> userList = new ArrayList<>();   //List with repeating users
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user3);    //repeats

        List<User> userList1 = new ArrayList<>();   //List with repeating userName
        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);
        userList1.add(user4);  //repeats name of user 3, put/remove slashes for checking

        List<User> userList2 = new ArrayList<>();   //List with repeating userEmail
        userList2.add(user1);
        userList2.add(user2);
        userList2.add(user3);
        userList2.add(user5);  //repeats email of user 3, put/remove slashes for checking

        System.out.println(userList);
        System.out.println("----duplicate users as object search (Method wihout loop usage)--");
        System.out.println(DuplicatesCheck.hasDuplicates_1(userList));
        System.out.println("----duplicate users as object search (Method with iterator usage)--");
        System.out.println(DuplicatesCheck.hasDuplicates_2(userList));
        System.out.println("----duplicate userName search:--");
        System.out.println(DuplicatesCheck.hasDuplicates_Names(userList1));
        System.out.println("----duplicate userEmail search:--");
        System.out.println(DuplicatesCheck.hasDuplicates_Emails(userList2));
    }

}



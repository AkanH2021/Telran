import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/* RU: Пусть дан список List объектов типа User{String fName, String lName, int age }.
Необходимо исключить из списка всех пользователей моложе 18 лет.
 EN: Let a List of objects of type User{String fName, String lName, int age } is given.
All users under the age of 18 must be excluded from the list*/
        Users usr1 = new Users("Ivan", "Ivanov", 22);
        Users usr2 = new Users("Jack", "Daniels", 14);
        Users usr3 = new Users("John", "Atanasoff", 33);
        Users usr4 = new Users("Anna", "Karenina", 28);
        Users usr5 = new Users("Maria", "Magdalena", 53);
        Users usr6 = new Users("Xenia", "Sobchak", 17);

        List<Users> users = new ArrayList<>();
        users.add(usr1);
        users.add(usr2);
        users.add(usr3);
        users.add(usr4);
        users.add(usr5);
        users.add(usr6);

        System.out.println(users); // Users List with all ages

        System.out.println(excludeByAge(users)); //Users List where age<18 are excluded
    }

    // Method where all users (age<18) are excluded from the given User List
    public static List<Users> excludeByAge(List<Users> usersList) {
        List<Users> exchangedNames = new ArrayList<>();
        if (usersList == null || usersList.isEmpty()) {
            return usersList;
        }
        for (Users u : usersList) {
            if (u.getAge() >= 18) {
                exchangedNames.add(new Users(u.getfName(), u.getlName(), u.getAge()));
            }
        }
        return exchangedNames;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    /* RU: Пусть дан список List объектов типа User{String fName, String lName, int age }. Предположим,
    при чтение User-ов из базы данных случилась ошибка и у всех пользователей из списка поменялись
    местами fName и lName. Необходимо написать метод, который исправит данную ситуацию.
     EN: Let there be a given List of objects of type User{String fName, String lName, int age }. Suppose
     when reading Users from the database, an error occurred and for all users from the list fName and lName
     parameters are swapped. It is necessary to write a method that will correct this situation.*/
    public static void main(String[] args) {

        Users usr1 = new Users("Ivan", "Ivanov", 22);
        Users usr2 = new Users("Jack", "Daniels", 42);
        Users usr3 = new Users("John", "Atanasoff", 33);
        Users usr4 = new Users("Anna", "Karenina", 28);
        Users usr5 = new Users("Maria", "Magdalena", 53);
        Users usr6 = new Users("Xenia", "Sobchak", 34);

        List<Users> users = new ArrayList<>();
        users.add(usr1);
        users.add(usr2);
        users.add(usr3);
        users.add(usr4);
        users.add(usr5);
        users.add(usr6);

        System.out.println(users); // Users List before exchange of fName and lName

        System.out.println(namesExchange(users)); //Users List after using exchange method
    }

    public static List<Users> namesExchange(List<Users> usersList) { // User List fName and lName exchange method
        List<Users> exchangedNames = new ArrayList<>();
        if (usersList == null || usersList.isEmpty()) {
            return usersList;
        }
        for (Users u : usersList) {
            exchangedNames.add(new Users(u.getlName(), u.getfName(), u.getAge()));
        }
        return exchangedNames;
    }
}

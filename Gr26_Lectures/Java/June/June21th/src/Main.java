import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Daniels", "Jack", 25);
        User u2 = new User("Linch", "David", 25);
        User u3 = new User("Andreson", "Christian", 25);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        System.out.println(users);

        namesChange(users);
        System.out.println(users);

    }

    public static void namesChange(List<User> incoming) {
        for (User u: incoming ) {
        String name = u.getfName();
        u.setfName(u.getlName());
        u.setlName(name);
        }
    }
}

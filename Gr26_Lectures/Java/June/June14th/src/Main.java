import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Integer[] integers = {1,17,-4,8};

        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        User u1 = new User("Jack", 31, "jack@google.com");
        User u2 = new User("John", 21, "john@google.com");
        User u3 = new User("Nick", 19, "nick@google.com");
        User u4 = new User("Anna", 23, "anna@google.com");
        User u5 = new User("Antony", 45, "antony@google.com");

        User[] users = {u1, u2, u3, u4, u5};
        print(users);
        System.out.println("-------sort by age");

        Comparator<User> comparator = new UserByAgeComparator();
        Arrays.sort(users, comparator);
        print(users);

        System.out.println("-------sort by name");
        Arrays.sort(users, new UserByNameComparator());
        print(users);

        System.out.println("------------- sort by default (use Comparable, email)");
        Arrays.sort(users);
        print(users);

        List<String> strings = new ArrayList<>();
        strings.add("uiy");
        strings.add("y");
        strings.add("ykfdhds");
        strings.add("afdoijfasfa");
        strings.add("rslktst");
        strings.add("strjatkkktykthhu");
        strings.add("uyyyuh");
        strings.sort(new StringByLengthComparator());

        System.out.println(strings);

    }
    public static void print(User[] user) {
        for (User u: user) {
            System.out.println(u);
        }
    }

}

package Task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicatesCheck extends User {
    public DuplicatesCheck(String name, String email) {
        super(name, email);
    }

    public static boolean hasDuplicates_1(List<User> userList) { ////return user's id (user number) duplicate boolean; method1 without cycle
        Set<User> userSet = new HashSet<>(userList);
        return userSet.size() < userList.size();
    }

    public static boolean hasDuplicates_2(List<User> userList) { //return user's id (user number) duplicate boolean; method2 - with iterator usage
        Set<User> userSet = new HashSet<>(userList);
        Iterator<User> i = userList.iterator();
        while (i.hasNext()) {
            userSet.add(i.next());
        }
        return userSet.size() < userList.size();
    }

    public static boolean hasDuplicates_Names(List<User> userList) { // return userName duplicate boolean;
        Set<String> userNameSet = new HashSet<>();
        for (User user : userList) {
            userNameSet.add(user.getName());
        }
        return userNameSet.size() < userList.size();  //if there are userName duplicates, return true; else return false
    }

    public static boolean hasDuplicates_Emails(List<User> userList) { // return userEmail duplicate boolean;
        Set<String> userEmailSet = new HashSet<>();
        for (User user : userList) {
            userEmailSet.add(user.getName());
        }
        return userEmailSet.size() < userList.size();   //if there are userEmail duplicates, return true; else return false
    }


}

package Task2;

import java.util.List;

public class Group   {
    String title;
    List<Student> stList;

    public Group(String title, List<Student> stList) {
        this.title = title;
        this.stList = stList;
    }

    public List<Student> getStList() {
        return stList;
    }

    @Override
    public String toString() {
        return "Group " + title + ", stList=" + stList;
    }
}
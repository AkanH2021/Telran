package task3;

import java.util.List;

public class Author {
    private String fName;
    private String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }


    @Override
    public String toString() {
        return "Author: " + getfName() + " " + getlName();
    }

}
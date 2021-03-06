public class Users {
    private String fName;
    private String lName;
    private int age;

    public Users(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User: " + " " + fName + '\'' + ", " + lName + '\'' + ", " + age + System.lineSeparator();
    }
}


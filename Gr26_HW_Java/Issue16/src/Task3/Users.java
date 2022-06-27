package Task3;

public class Users {
    private String fName;
    private String lName;
    String email;

    public Users(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "username= " + getfName() + " " + getlName() + "; email: " + getEmail() + System.lineSeparator();
    }

}

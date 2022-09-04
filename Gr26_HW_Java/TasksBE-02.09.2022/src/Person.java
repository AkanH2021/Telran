public class Person {
    private String fName;
    private String lName;
    private String email;

    public Person(String fName, String lName, String email) {
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

    public String nameShortage() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            result.append((i < 1) ? getfName().charAt(i) : '.');
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

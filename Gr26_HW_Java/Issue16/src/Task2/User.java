package Task2;

public class User  {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "username= " + getName() + "; email: " + getEmail() + System.lineSeparator();
    }


}

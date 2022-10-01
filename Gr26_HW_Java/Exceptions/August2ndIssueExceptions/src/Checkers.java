import exceptions.*;

public class Checkers {

    public boolean inputCheck(User user) {
        return user != null;
    }

    public boolean firstNameCheck(String firstName) throws InsufficientDataException {
        return firstName != null && firstName.length() >= 2;
    }

    public boolean lastNameCheck(String lastName) {
        return lastName != null && lastName.length() >= 2;
    }

    public boolean emailCheck(String email) {
        return email.length() >= 4 || email.contains("@");
    }

    public boolean ageCheck(int age) {
        return age >= 0 && age <= 125;
    }

    public boolean fieldsCheck(User user) {
        return user.toString().split(";").length <= 4;
    }

    public void userControl(User user) {
        Checkers checkers = new Checkers();
        try {
            user = new User(user.getFirstName(), user.getLastName(), user.getAge(), user.getEmail());

        } catch (Exception e) {
            throw new RuntimeException();
        }
        if (!checkers.inputCheck(user)) {
            throw new InsufficientDataException("Data is missing");
        }
        if (!checkers.ageCheck(user.getAge())) {
            throw new EmptyFieldException("age is wrong");
        }
        if (!checkers.emailCheck(user.getEmail())) {
            throw new InsufficientDataException("email is wrong");
        }
        if (!checkers.fieldsCheck(user)) {
            throw new EmptyFieldException("Input fields are more than needed");
        }
        if (!checkers.firstNameCheck(user.getFirstName())) {
            throw new EmptyFieldException("Field firstName is wrong");
        }
        if (!checkers.lastNameCheck(user.getLastName())) {
            throw new EmptyFieldException("Field lastName is wrong");
        }
    }

}
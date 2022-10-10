import java.util.List;

public class PersonWithBankAccount {

    String name;
    List<String> ibanns;

    public PersonWithBankAccount(String name, List<String> ibanns) {
        this.name = name;
        this.ibanns = ibanns;
    }

    public String getName() {
        return name;
    }

    public List<String> getIbanns() {
        return ibanns;
    }

    @Override
    public String toString() {
        return "PersonWithBankAccount{" +
                "name='" + name + '\'' +
                ", ibanns=" + ibanns +
                '}';
    }
}

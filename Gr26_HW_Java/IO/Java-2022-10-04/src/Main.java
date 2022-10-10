import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*Даны следующие классы: Person {String name;}, BankAccountWithOwner{Person owner;String ibann;}
    и данс писок банковских счетов List<BankAccountWithOwner> accounts. Написать функцию,
    которая вернет List<PersonWithBankAccounts> persons (PersonWithBankAccount{String name;
        List<String> ibanns;}) такой, что к каждому человеку прилагается список ibanns его банковских счетов.*/
    public static void main(String[] args) {
        Person person1 = new Person("Ivan");
        Person person2 = new Person("Maria");
        Person person3 = new Person("Vladimir");
        BankAccountWithOwner ba1a = new BankAccountWithOwner(person1, "1234567890");
        BankAccountWithOwner ba1b = new BankAccountWithOwner(person1, "1287686567");
        BankAccountWithOwner ba2a = new BankAccountWithOwner(person2, "2286586554");
        BankAccountWithOwner ba2b = new BankAccountWithOwner(person2, "2255433454");
        BankAccountWithOwner ba3a = new BankAccountWithOwner(person3, "3354745755");
        BankAccountWithOwner ba3b = new BankAccountWithOwner(person3, "3355433454");

        List<BankAccountWithOwner> accWithOwners = List.of(ba1a, ba1b, ba2a, ba2b, ba3a, ba3b);
        System.out.println(task1(accWithOwners));
    }

    public static List<PersonWithBankAccount> task1 (List<BankAccountWithOwner> accWithOwners) {
        return accWithOwners.stream()
                .collect(Collectors.groupingBy(acc ->acc.getOwner().getName(),
                        Collectors.mapping(BankAccountWithOwner::getIban, Collectors.toList())))
                        .entrySet().stream()
                .map(p->new PersonWithBankAccount(p.getKey(), p.getValue()))
                .collect(Collectors.toList());
        }
  }

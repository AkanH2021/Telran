package v2InnerClass;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
/*  1. Дан список  BankAccount {Person person, String IBAN, double balance). Используя stream необходимо вывести на
    экран все аккаунты, баланс которых составляет менее 100.
    2. Дан список  BankAccount {Person person, String IBAN, double balance), Person{String fName,
    String lName String email)   Используя stream,  сформировать отсортированный по lName лист строк
    вида “Lennon J.;IBAN: DE19************43;lennon@gmail.com”    (т.е. ФИО; замаскированный счет,
    в котором открыты только первые 2 и последние 2 символа; email)  для всех клиентов,
    чей баланс более 100000*/

    public static void main(String[] args) {
        Person p1 = new Person("John", "Lennon", "john@lennon.com");
        Person p2 = new Person("Paul", "McCartney", "paul@mccartney.com");
        Person p3 = new Person("Ringo", "Starr", "ringo@starr.com");
        Person p4 = new Person("George", "Harrison", "george@harrison.com");

        Person.BankAccount ba1a = new Person.BankAccount(p1, "DE1912345678909843", 120);
        Person.BankAccount ba2a = new Person.BankAccount(p2, "DE1912345678909844", 150);
        Person.BankAccount ba3a = new Person.BankAccount(p3, "DE1912345678909845", 90);
        Person.BankAccount ba4a = new Person.BankAccount(p4, "DE1912345678909846", 85);

        Person.BankAccount ba1b = new Person.BankAccount(p1, "DE1912345678909843", 120000);
        Person.BankAccount ba2b = new Person.BankAccount(p2, "DE1912345678909844", 150000);
        Person.BankAccount ba3b = new Person.BankAccount(p3, "DE1912345678909845", 90000);
        Person.BankAccount ba4b = new Person.BankAccount(p4, "DE1912345678909846", 85000);

        Stream.of(ba1a, ba2a, ba3a, ba4a)   //task1
                .filter(s -> s != null && s.getBalance() < 100)
                .forEach(s -> System.out.println(s));

        List<Person.BankAccount> bankAccounts = List.of(ba1b, ba2b, ba3b, ba4b);   //task2
        List<String> resList = bankAccounts.stream()
                .filter(s -> s != null && s.getBalance() >= 100000)
                .sorted(Comparator.comparing(s -> s.getPerson().getlName()))
                .map(s -> s.getPerson().getlName() + " "
                        + s.getPerson().nameShortage() + "; "
                        + "IBAN: " +s.securedIBAN(s.getIBAN()) + "; "
                        + (s.getPerson().getEmail()) + ";")
                .collect(Collectors.toList());
        System.out.println(resList);
    }

}

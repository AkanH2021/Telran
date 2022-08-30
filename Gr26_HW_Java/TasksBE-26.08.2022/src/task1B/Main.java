package task1B;

import task1A.Address;
import task1A.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", "ivan@ivanov.com", "0123456", new Address("0123", "Berlin", "Volkstr", "1"));
        Person p2 = new Person("Sergey", "Sergeev", "sergey@sergeev.com", "0123478", new Address("0123", "Berlin", "Volkstr", "2"));
        Person p3 = new Person("Anna", "Ivanova", "anna@ivanov.com", "01234910", new Address("0123", "Berlin", "Volkstr", "3"));
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Task1b namesList = new Task1b() {
            @Override
            public <T> List<T> showData(List<Person> personList) {
                List<String> namesList = new ArrayList<>();
                for (Person p : personList) {
                    namesList.add(p.getfName());
                }
                return (List<T>) namesList;
            }
        };
        System.out.println(namesList.showData(personList));

        Task1b surNamesList = new Task1b() {
            @Override
            public <T> List<T> showData(List<Person> personList) {
                List<String> surNamesList = new ArrayList<>();
                for (Person p : personList) {
                    surNamesList.add(p.getlName());
                }
                return (List<T>) surNamesList;
            }
        };
        System.out.println(surNamesList.showData(personList));

        Task1b emailsList = new Task1b() {
            @Override
            public <T> List<T> showData(List<Person> personList) {
                List<String> emailsList = new ArrayList<>();
                for (Person p : personList) {
                    emailsList.add(p.getEmail());
                }
                return (List<T>) emailsList;
            }
        };
        System.out.println(emailsList.showData(personList));

        Task1b phonesList = new Task1b() {
            @Override
            public <T> List<T> showData(List<Person> personList) {
                List<String> phonesList = new ArrayList<>();
                for (Person p : personList) {
                    phonesList.add(p.getPhone());
                }
                return (List<T>) phonesList;
            }
        };
        System.out.println(phonesList.showData(personList));

        Task1b addressList = new Task1b() {
            @Override
            public <T> List<T> showData(List<Person> personList) {
                List<Address> addressList = new ArrayList<>();
                for (Person p : personList) {
                    addressList.add(p.getAddress());
                }
                return (List<T>) addressList;
            }
        };
        System.out.println(addressList.showData(personList));
    }
}

interface Task1b {
    <T> List<T> showData(List<Person> personList);
}

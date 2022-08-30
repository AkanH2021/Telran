package task1A;

import java.util.ArrayList;
import java.util.List;

public class Main {
  /*  В программе задан список task1A.Person{ String fName, String lName, String email, String phone, task1A.Address address}.
  task1A.Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
          -получить список всех ФИО
          -получить список всех e-mail
          -получить список всех телефонов
          -получить список всех адресов в виде строки адреса
  Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра
  должен приходить список task1A.Person и реализация необходимого способа обработки. Ограничения: не использовать
  стандартные Java интерфейсы, все необходимые классы и интерфейсы описывать и реализовывать самостоятельно. Не использовать stream.  */
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", "ivan@ivanov.com", "0123456", new Address("0123", "Berlin", "Volkstr", "1"));
        Person p2 = new Person("Sergey", "Sergeev", "sergey@sergeev.com", "0123478", new Address("0123", "Berlin", "Volkstr", "2"));
        Person p3 = new Person("Anna", "Ivanova", "anna@ivanov.com", "01234910", new Address("0123", "Berlin", "Volkstr", "3"));
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);


        System.out.println("****************");

        Function1 getPersonNamesList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> namesList = new ArrayList<>();
                for (Person p : list) {
                    namesList.add(p.getfName());
                }
                return namesList;
            }
        };
        System.out.println(task1(personList, getPersonNamesList));

        Function1 getPersonSurnamesList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> surNamesList = new ArrayList<>();
                for (Person p : list) {
                    surNamesList.add(p.getlName());
                }
                return surNamesList;
            }
        };
        System.out.println(task1(personList, getPersonSurnamesList));

        Function1 getPersonEmailsList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> emailsList = new ArrayList<>();
                for (Person p : list) {
                    emailsList.add(p.getEmail());
                }
                return emailsList;
            }
        };
        System.out.println(task1(personList, getPersonEmailsList));

        Function1 getPersonPhoneList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> phonesList = new ArrayList<>();
                for (Person p : list) {
                    phonesList.add(p.getPhone());
                }
                return phonesList;
            }
        };
        System.out.println(task1(personList, getPersonPhoneList));

        Function1 getPersonAddressList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> addressList = new ArrayList<>();
                for (Person p : list) {
                    addressList.add(String.valueOf(p.getAddress()));
                }
                return addressList;
            }
        };
        System.out.println(task1(personList, getPersonAddressList));

        System.out.println("****************");

        Task1a getAllPersonDataList = new Task1a() {
            @Override
            public List<Person> persons() {
                List<Person> resultList;
                resultList = new ArrayList<>(personList);
                return resultList;
            }
        };
        System.out.println(getAllPersonDataList.persons());

    }

    public static List<String> task1(List<Person> list, Function1 function1) {
        return function1.apply(list);
    }


}

interface Function1 {
    List<String> apply (List<Person> list);
}

interface Task1a {
    List<Person> persons();
}

//    interface Task2 {
//        <T> List<T> takeFromOtherList(List<T> list); //not ready
//    }





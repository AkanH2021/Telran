import java.util.ArrayList;
import java.util.List;

public class Main {
  /*  В программе задан список Person{ String fName, String lName, String email, String phone, Address address}.
  Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
          -получить список всех ФИО
          -получить список всех e-mail
          -получить список всех телефонов
          -получить список всех адресов в виде строки адреса
  Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра
  должен приходить список Person и реализация необходимого способа обработки. Ограничения: не использовать
  стандартные Java интерфейсы, все необходимые классы и интерфейсы описывать и реализовывать самостоятельно. Не использовать stream.  */
    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov", "ivan@ivanov.com", "0123456", new Address("0123", "Berlin", "Volkstr", "1"));
        Person p2 = new Person("Sergey", "Sergeev", "sergey@sergeev.com", "0123478", new Address("0123", "Berlin", "Volkstr", "2"));
        Person p3 = new Person("Anna", "Ivanova", "anna@ivanov.com", "01234910", new Address("0123", "Berlin", "Volkstr", "3"));
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Task1a namesList = new Task1a() {
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

        Task1a surNamesList = new Task1a() {
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

        Task1a emailsList = new Task1a() {
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

        Task1a phonesList = new Task1a() {
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

        Task1a addressList = new Task1a() {
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

        System.out.println("****************");

        Task1b task1 = new Task1b() {
            @Override
            public List<Person> persons() {
                List<Person> resultList;
                resultList = new ArrayList<>(personList);
                return resultList;
            }
        };
        System.out.println(task1.persons());

    }
}

interface Task1a {
    <T> List<T> showData(List<Person> personList);
}

interface Task1b {
    List<Person> persons();
}

//    interface Task2 {
//        <T> List<T> takeFromOtherList(List<T> list); //not ready
//    }





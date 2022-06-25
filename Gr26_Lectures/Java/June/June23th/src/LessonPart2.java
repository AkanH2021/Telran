import java.util.*;

public class LessonPart2 {

    public static void main(String[] args) {
//.Пусть дан список List объектов типа User{String fName, String lName, int age }.
// Необходимо исключить из списка всех пользователей моложе 18 лет.

        List<Person> people = Arrays.asList(
                new Person("a", 10)
                , new Person("b", 10)
                , new Person("c", 10)
                , new Person("d", 20)
                , new Person("e", 30)
                , new Person("f", 15)
                , new Person("g", 25)
        );

        List<Person> list = new ArrayList<>(people);
        removeChildren(list);
        System.out.println(list);

        ListIterator<Person> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public static void removeChildren0(List<Person> list) {   //does not work
        for (Person p: list) {
            if (p.getAge()<18)  list.remove(p);   //error
           }
        }

    public static void removeChildren(List<Person> list) {   //does not work
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < 18) list.remove(i);
        }
    }

    public static void removeChildrenWithIterator(List<Person> list) {
        ListIterator<Person> listIterator = list.listIterator();

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAge() < 18) iterator.remove();
        }
    }
}
//homework:
//реализовать свой Arraylist или Linkedlist.

//*
// создать какой то объект(Лист) которъй релизует метод Iterator, и метод должен возращатъ объект етого класса
// нужно чтобъ ета реализация имплементила Iterable  (implement Iterable): Мethod:   Iterator<T> iterator;
// В качестве проверки - на своем созданном листе: по подобию:  for (Person p: list) {
//            if (p.getAge()<18)  list.remove(p);
//           }

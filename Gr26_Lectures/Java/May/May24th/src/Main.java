public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jack", 20);
        Person p2 = new Person("Nick", 22);
        Person p3 = new Person("Qwe", 23);

        Person[] people = new Person[]{p1, p2};
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        PersonArray personArray = new PersonArray(people);
        System.out.println(personArray);

        personArray.add(p3);
        System.out.println(personArray);

    }


}

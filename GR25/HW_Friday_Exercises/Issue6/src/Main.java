import java.util.Arrays;

public class Main {
    /* 1. Create class Dog, create several dog objects and print the number of objects created on the screen.
    Each Dog should have name and age. Add getters and setters. All variables should be private.
    Setter method for dog's age should not allow negative age.
        2. create two classes: Address with the fields street and houseNumber, constructor etc and Person
        with fields name and address, constructor, getters etc.
        Create the third class AddressGetter which accepts an array of persons and returns an array of their addresses.

     */
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alpha", 2);
        Dog dog2 = new Dog("Beta", 1);
        Dog dog3 = new Dog("Gamma", -2);
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println(Dog.getCounter());
        Dog.setCounter(50);
        System.out.println(Dog.getCounter());

        Address address1 = new Address("Hernestr", 17);
        Address address2 = new Address("Hernestr", 18);
        Address address3 = new Address("Hernestr", 19);
        Person p1 = new Person("Hans", address1);
        Person p2 = new Person("Henzel",address2);
        Person p3 = new Person("Gretel",address3);
        Person[] people = {p1, p2, p3};
        AddressGetter addressGetter = new AddressGetter(people);
        System.out.println(addressGetter);

        Address[] peopleAddress = addressGetter.getPersonAddresses();
        System.out.println(Arrays.toString(peopleAddress));
    }

}

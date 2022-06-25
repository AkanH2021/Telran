package com.company;

import java.util.Arrays;

/*create class DOg and several dog objects
and print the amount of objects created on the
screen. Each dog should have name, and age.
 add getters and setters. ALl variables should be
  private. Setter method for dog's age should not allow
  negative age.
  2. create 2 classes: Address with the fields Street and houseNumber,
  constructor etc and Person with fields name and address, constructor,
  getters etc.
  create the third class addressGetter which accepts and array of
  persons and returns an array of their addresses
  */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alfa", 3);
        Dog dog2 = new Dog("Betta", 4);
        Dog dog3 = new Dog("Gamma", 5);

        System.out.println(Dog.getCount());

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog.setCount(50);
        System.out.println(Dog.getCount());

    }
}

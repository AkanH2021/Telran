package com.company;

public class Main {

    public static void main(String[] args) {
    MyDate date1 = new MyDate(12,3, 1999);
    String т = "shoes";


    Product pr1 = new Product("shoes", 60.0);
        Product pr2 = new Product("shirt", 50.0);

        Person p1 = new Person("Ivan", "Ivanov", date1);
        Person p2 = new Person("Nick", "Nickov", date1);
        System.out.println(date1);

        Product[] products = {pr1, pr2, new Product("shirt2", 35.5)};
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum+=products[i].getSellingPrice();
            System.out.println(products[i].toString());
        }
        System.out.println("------------");
        System.out.println("Summa: " + sum);

        System.out.println(pr1.toString());
    }
}

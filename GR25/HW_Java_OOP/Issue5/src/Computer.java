public class Computer {

    String cpu;
    String id;
    int ram;
    int hdd;
    double price;

    public Computer(String pcId, String pcCpu, int pcRam, int pcHdd, double pcPrice) {
        id = pcId;
        cpu = pcCpu;
        ram = pcRam;
        hdd = pcHdd;
        price = pcPrice;
    }


    //1. Make a class Computer with the following attributes (String cpu, int ram, int hdd, double price).
// Implement the method that print all information about the Computer. Create several objects of Computer and put it into array. Print all computers.
    void printComputerDetails() {
        System.out.println("Hardware of " + id + " is: " + ram + "GB RAM, " + hdd + "GB HDD, " + "the price is: " + price + "EUR, " + "CPU is: " + cpu);

//2. Make class Book. It should contain two fields: author and title. The author is a Class with the following field firstName, lastName, yearOfBirth.
// Implement the method of printing the Book
//3. Do you remember the tasks about students and grades? Try to create the class or classes those ft best for this task

    }
}
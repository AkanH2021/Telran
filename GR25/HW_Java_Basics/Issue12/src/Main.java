public class Main {
/* 1. Write the program that prints the larger of the two given numbers. Actually it’s the same like we did in class.
 If you are sure that it is easy this task can be omitted.
 2. Write the program that prints the smaller of the three given numbers.
 3. Imagine, you are writing the program for cinema. The method you should create takes two arguments.
 The first is the age of the person; the second is an age limit of the film.
 The method should print if this film allowed for the person or not.
 4. Imagine, the user of your program has chosen one of the 3 alternatives.
 This chose is saved in int variable (0, 1 or 2). Implement the program that print something like “the first item is chosen”  */

    public static void main(String[] args) {
        comparisonDouble(60, 75);
        comparisonTriple(40, 20, 30);
        restriction(17, 18);
        chosenWay(3);
    }

    public static void comparisonDouble(int d1, int d2) {
        int smallest;
        if (d1 < d2) {
            smallest = d1;
        } else {
            smallest = d2;
        }
        System.out.println(smallest + " is the smallest digit between 2 digits");
    }

    //end of 1st part of the homework
    public static void comparisonTriple(int d1, int d2, int d3) {
        int smallest;
        if (d1 < d2) {
            if (d3 < d1) {
                smallest = d3;
            } else {
                smallest = d1;
            }
        } else {
            if (d2 < d3) {
                smallest = d2;
            } else {
                smallest = d3;
            }
        }
        System.out.println(smallest + " is the smallest digit between 3 digits");
    }
    //end of 2nd part of the homework

    public static void restriction(int a, int b) {
        if (a >= b) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
    //end of 3rd part of the homework

    public static void chosenWay(int choice) {

        String a = "you made choice num" + choice;

        if (choice == 1) {
            System.out.println(a);
        }
        if (choice == 2) {
            System.out.println(a);
        }
        if (choice == 3) {
            System.out.println(a);
        }
    }
}

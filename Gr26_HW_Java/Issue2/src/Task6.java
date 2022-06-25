public class Task6 {
    /* Given arrays String[] names and int[ ] yearsOfBirthday of the same length, that contains names
    and years of birthday of the persons. Every element in yearsOfBirthday is corresponding with element
     at the same index in names. Implement the program that prints the name and the age of all person who
     older that given int. Than print the name and age of oldest person.
  For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
Olga 18 years
Oleg 40 years
 -> Oleg 40 years is oldest/* */

    public static void main(String[] args) {
        String[] names = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] yearsOfBirth = {2004, 1982, 2008, 2010};

        oldestPerson(names, yearsOfBirth, 15);
    }

    public static void oldestPerson(String[] names, int[] yearsOfBirth, int limitAge) { //variant 1
        int comparisonYear = 2022 - limitAge;
        String nameOfTheOldest = "";
        if (names.length == yearsOfBirth.length) {
            for (int i = 0; i < yearsOfBirth.length; i++) {
                if (yearsOfBirth[i] < comparisonYear) {
                    int age = 2022 - yearsOfBirth[i];
                    System.out.println(names[i] + " " + age + " years");
                }
            }
        }
        int oldest = yearsOfBirth[0];
        for (int i = 0; i < yearsOfBirth.length; i++) {
            if (oldest > yearsOfBirth[i]) {
                oldest = yearsOfBirth[i];
                nameOfTheOldest = names[i];
                int age = 2022 - yearsOfBirth[i];
                System.out.println(nameOfTheOldest + " " + age + " years is oldest");
            }
        }
    }

}


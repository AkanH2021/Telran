public class NamesArrayTeacher {

    public static void main(String[] args) {
        String[] names = {"Olga", "Andrey", "Sergey", "Oleg", "Elena"};
        String[] persons = {"Olga Sergeeva", "Nikolaev Andrey", "Elena Maers", "Nina Umova", "Tarasova Elena", "Lavrov Oleg"};
        normalizesPersons(names, persons);
    }


    public static void normalizesPersons(String[] names, String[] persons) {
        String[] arrayUnnormalizePersons = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            boolean found = false;
            String[] onePerson = persons[i].split(" ");
            for (int j = 0; j < names.length; j++) {
                if (onePerson[0].equals(names[j])) {
                    found = true;
                    break;
                }
                if (onePerson[1].equals(names[j])) {
                    persons[i] = onePerson[1] + " " + onePerson[0];
                    found = true;
                }
            }
            if (!found) {
                arrayUnnormalizePersons[i] = persons[i] + " - there is no any data about first name " + onePerson[0] + " or first name " + onePerson[1];
            }

        }
        printArray(persons);
        printArray(arrayUnnormalizePersons);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }
}

public class ArrayTasks_Tasks6_and_7 {

    public static void main(String[] args) {
        /* Declare the array of double. Put in it 5 values. Print this array.  */
        double[] myDouble = {0.8, 1.6, 5.5, 8.4, 9.3};
        task6(myDouble);


        /* Declare the array of String. Put in it 5 values. Print this array from the last value to first. */
        String[] myString = {"Telran", "Bundeswehr", "Arbaitsamt", "Rathaus", "Netzwerk"};
        task7(myString);
    }
    public static void task6(double [] myDouble) {
        for (int i = 0; i < myDouble.length; i++) {
            System.out.println(myDouble[i]);
        }
    }

    public static void task7(String [] myString) {
        for (int i = myString.length - 1; i >= 0; i--) {
            System.out.println(myString[i]);
        }
    }
}
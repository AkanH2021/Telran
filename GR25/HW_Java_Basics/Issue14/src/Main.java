public class Main {
    /* 1. Implement the method that returns true if one of its two arguments is equal “hello”
        2. Implement the method boolean checkDiv(int a, int b) that checks if [int a] is divisible by [int b] without any remainder or not.
         (Hint: There is the modulo (%) operator in Java. The % operator that returns the remainder of two integers.
         For example 17%3 is 2 because 17 divided by 3 leaves a remainder of 2, but 15%3 is 0). Print the result in the main method.
         Examples: checkDiv (10,2) -> true ;      checkDiv (10,3) -> false
       3.  Write the method boolean checkMonth(int month) that takes an integer and returns true, if this int can be interpreted as month number, else returns false. Print the result in the main method.
        Examples: checkMonth(10) -> true,      checkMonth(15) -> false.
       4.  * Implement an alarm controller method. It should alarm (return true) if the door is open
        and the time is between 22 pm and 7am. It should return false otherwise. */
    public static void main(String[] args) {
        // write your code here
        rtnHello("privet", "moin");
        System.out.println(rtnHello1("privet", "hello"));
        checkDiv(60, 14);
        checkDiv1(60, 20);
        System.out.println(checkMonth(12));
        System.out.println(alarmControl(13, 1, 7));
        //System.out.println(isAlarm( false, time));
    }

    public static void rtnHello(String a, String b) {
        String b1 = "true";
        String b2 = "false";
        if ((a == "hello") || (b == "hello")) {
            System.out.println(b1);
        } else {
            System.out.println(b2);
        }
    }
// end of 1st variant of the 1st part of the homework

    public static boolean rtnHello1(String a, String b) {
        if ((a == "hello") || (b == "hello")) {
            return true;
        } else {
            return false;
        }
    }
// end of 2nd variant of the 1st part of the homework

    public static void checkDiv(int a, int b) {
        String result1 = "The digit " + a + " is dividible by digit " + b + " without remainder";
        String result2 = "The digit " + a + " is dividible by digit " + b + " with remainder";
        int c = (a % b);

        if (c == 0) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }

    // end of 2nd part of the homework var1
    public static boolean checkDiv1(int a, int b) {

        if (a % b == 0) {
            return true;
        } else return false;
    }
//end of part 2 var 2 of homework

    public static boolean checkMonth(int month) {
        if (month <= 0) {
            return false;
        }
        if (month <= 12) {
            return true;
        } else {
            return false;
        }
    }
// end of 3rd part of the homework

    public static boolean alarmControl(int time, int state, int day) {
        // state 1 (true) - door is open, state 0 (false) - door is closed
//принимаем что с в обед с 13 до 14 часов дверь должна быть закрыта (сотрудники обедают)
//принимаем что в воскресенье никого нет, и дверь должна быть закрыта
//принимаем что с 7 до 22 часов дверь должна быть открыта (приемный день)
        if (day == 7 && state == 1) {
            return false;
        }
        if (day != 7 && time >= 13 && time <= 14) {
            return false;
        }
        if ((day != 7 && time >= 7 && time <= 22) && (state == 1)) {
            return true;
        } else {
            return false;
        }
    }
}
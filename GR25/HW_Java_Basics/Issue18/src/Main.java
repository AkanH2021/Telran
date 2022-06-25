public class Main {
    /* 1.  Implement method that takes an integer from 1 to 7 and returns the day of the week as a String. Call it from the main method. 1-“ Monday”, 2-“ Tuesday” etc.
Examples: getDayOfWeek(1) -> “Monday”
getDayOfWeek(5) -> “Friday”
2. Implement the “Calculator” method using <switch .....case>. The method takes two numbers and the operator and return result
    For example:   calculate(10, 2, “*”) -> 20;     
    calculate(10, 2, “-”) -> 8;    */
    public static void main(String[] args) {
        System.out.println("The chosen day is : " + getDayOfWeek(6));
        System.out.println(calculate(22, 4, "-"));
    }

    public static String getDayOfWeek(int n) {
        if (n >= 1 && n <= 7) {
            if (n == 1) {
                return "Monday";
            }
            if (n == 2) {
                return "Tuesday";
            }
            if (n == 3) {
                return "Wednesday";
            }
            if (n == 4) {
                return "Thursday";
            }
            if (n == 5) {
                return "Friday";
            }
            if (n == 6) {
                return "Saturday";
            }
            if (n == 7) {
                return "Sunday";
            }
        } else
            return "Wrong day is entered";
        return null;
    }

    //End of 1st part of the homework
    public static double calculate(double n1, double n2, String s) {
        double s1 = (n1 + n2);
        double s2 = (n1 - n2);
        double s3 = (n1 * n2);
        double s4 = (n1 / n2);
        switch (s) {
            case "+":
                return s1;
            case "-":
                return s2;
            case "*":
                return s3;
            case "/":
                return s4;
            default:
                System.out.println("No such function");
        }
        return 0;
    }
}
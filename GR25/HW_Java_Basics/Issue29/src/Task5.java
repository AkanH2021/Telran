public class Task5 {
    /* 5.** Let a string be given that means a binary number. Implement a method that converts it to a decimal number.
You have to use only length() and charAt() methods of String class. */

    public static void main(String[] args) {
        task5("11");

        //  9 8 7 6 5 4 3 2 1 0  index in bin num
        //  0 1 2 3 4 5 6 7 8 9 index in string
        //  1 0 1 0 1 0 1 0 1 symbol
    }
    public static void task5(String str1) {
        int digit=0;
        int degree = str1.length()-1;
        for (int i = 0; i < str1.length() ; i++) {
            if (str1.charAt(i)=='1')
                digit += Math.pow(2, degree);
            degree--;
        }
        System.out.println(digit);
    }

}

public class ModulDigit {

    public static void main(String[] args) {
        System.out.println(mathModul(-2));
    }



    public static double mathModul(double n1) {
       double i = (n1 * (-1));

        if (n1 >0) {
            return n1;}
        else {
            return i;
        }

    }
}

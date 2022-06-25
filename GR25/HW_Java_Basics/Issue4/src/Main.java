public class Main {
/*  1.Read about variables
   2. Implement the program that prints to screen “area of a square with a side (side) is (area)”.
    The side and the area should be integer variables.
  3.  Implement the same program for the circle. Use double variables type.
   4. Implement the program that prints to screen the result of addition, subtraction, multiplication and division of two numbers.
  --  The numbers and the result should be variables. Try to implement two variants: for integers and for double variables. */

    public static void main(String[] args) {
        int side = 4;
        int area = side * side; //Formula for finding the area of square = side*side
        String q = "cm";
        String txt1 = "The area of a ";
        String sq1 = "square with ";
        String circ2 = "circle with ";
        String sq2 = "side ";
        String circ3 = "radius ";
        String txt2 = " is: ";
        System.out.println(txt1 + sq1 + sq2 + side + q + txt2 + area + q + 2);
//End of part 2 of the homework

        double rad = 4.5;
        double pi = 3.14;
        double circarea = pi * rad * rad; //Formula for finding the area of circle = 3,14 * rad *rad
        System.out.println(txt1 + circ2 + circ3 + rad + q + txt2 + circarea + q + 2);
//End of part 3 of the homework

        double digi1 = 131.2;
        double digi2 = 212.54;
//Using double variables
        System.out.println(digi1 + digi2);//
        System.out.println(digi1 - digi2);
        System.out.println(digi1 * digi2);
        System.out.println(digi1 / digi2);
//now we will use integers
        int digi_a = 233;
        int digi_b = 211;
        int plusing = digi_a + digi_b;
        int minusing = digi_a - digi_b;
        int multi = digi_a * digi_b;
        double divid = digi_a / digi_b;
        System.out.println(plusing);
        System.out.println(minusing);
        System.out.println(multi);
        System.out.println(divid);
    }
}

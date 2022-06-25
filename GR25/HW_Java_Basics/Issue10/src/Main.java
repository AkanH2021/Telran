    public class Main {
        /* Implement the task JavaWeb 2021-12-06 #6 using methods. Implement two separate methods: exchange method and print method.
        Implement the method that takes two arguments. The second argument specifies what percentage of the first number the method
         should return. For example: Arguments: (100, 11) -> result is 11.
        * Imagine, you should take some % for every exchange operation. Implement this method using the methods from task 1) and task 2)
        ** Implement the exchange method for the euro/rubles (actually it’s the same like the method from Task 1). Using all the methods
        you have, implement the method that convert rubles to dollars. (!!! You have exchange rate EUR/USD and EUR/RUB but don’t have USD/RUB rate).  */
        public static void main(String[] args) {
            System.out.println("We need to pay " + exchange(100, 1.2) + " EUR");
            System.out.println("The percentage is = " + percentage(40, 80) + "%");
            System.out.println("Customer will receive after our commission = " + comission(100.0, 1.2, 8) + "EUR");
            System.out.println("For 1000 RUB we will receive  " + doubleConversion(1000, 8.2, 1.5) + " USD");
        }

        public static double exchange(int a, double b) {
            return a / b;
            //a is the amount ot USD we want to buy
            //b is the exchange course

        }
        /* end of 1st part of the homework;*/

        public static double percentage(int a, int b) {
            return ((a * 100) / b);  //a is the part of total b
        }
        /* end of 2nd part of the homework;*/

        public static double comission(double a, double b, int e) {
            double c = a / b; /* a is the amount ot USD we want to buy, b is exchange course */
            double d = c - (c / 100 * e);             /* d is what customer will receive */
            return d;                               // e is our comission, for example 8%
        }
        /* end of 3rd part of the homework;*/

        public static double doubleConversion(double a, double b, double e) {
            double c = a / b; //a is amount in RUB, b is the rate RUB/EUR = 8.2 (1 EUR is 8.2 RUB
            double d = c * e; //d is amount of USD after conversion of EUR/USD by rate e = 1.5 (1 EUR = 1.5 USD)
            return d;
        }
    }

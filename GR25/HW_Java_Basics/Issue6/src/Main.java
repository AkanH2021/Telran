public class Main {
    /* Let’s given an amount in American dollars (USD) we need to pay. I think obviously it should be a variable.
    But we have only euro (EUR). The dollar rate is given too and should be variable too. So,
    implement the program which prints the amount in euro. For example: You need to pay 100 you need 83.3333 Euro */
    public static void main(String[] args) {
        // You need to pay 150$. The exchange rate USD/EUR is 1.2
        int usd = 150;
        double rate = 1.2;
        double exch = usd / rate;

        System.out.println("For the payment of " + usd + "$" + " you need " + exch + " EUR");
    }
}

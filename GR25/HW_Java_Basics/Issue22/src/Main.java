public class Main {
    /* 1.  Given two integers number1 and number2. Implement method that printы all numbers between number1 and number2 that divisible by 3.
    Example: printDivisibleByTree(10,20) ->
    12
    15
    18
2.  Given two integers number1 and number2. Implement method that returns the sum of all numbers between number1 and number2 that divisible by 3.
    Example: getSumDivisibleByTreeNumbers(20,10) -> 45
3.  Given two integers year1 and year2. Implement method that returns the quantity of leap years between year1 and year2.
    Example: getQuantityOfLeapYears (2000,2022) -> 6   */

    public static void main(String[] args) {
        printDivisibleByTree(10, 20);
        getSumDivisibleByTreeNumbers(10, 20);
        getQuantityOfLeapYears(2000, 2022);
    }
    public static void printDivisibleByTree(int n1, int n2) {
        int min, max;
        if (n1 > n2) {
            min = n2;
            max = n1;
        } else {
            min = n1;
            max = n2;
        }
        while (min <= max) {
            if (min % 3 == 0) {
                System.out.println(min);
            }
            min++;
        }
    }
    //End of task1 of homework;
    public static void getSumDivisibleByTreeNumbers(int n1, int n2) {
        int min, max;
        int sum = 0;
        if (n1 > n2) {
            min = n2;
            max = n1;
        } else {
            min = n1;
            max = n2;
        }
        while (min <= max) {
            if (min % 3 == 0) {
                sum += min;
            }
            min++;
        }
        System.out.println(sum);
    }
    //End of task2 of homework;
    public static void getQuantityOfLeapYears(int n1, int n2) {
        int yearMin, yearMax;
        int quantityLeapYears = 0;
        if (n1 > n2) {
            yearMin = n2;
            yearMax = n1;
        } else {
            yearMin = n1;
            yearMax = n2;
            while (yearMin <= yearMax) {
                if ((yearMin % 400 == 0) || (yearMin % 100 == 0) && yearMin % 4 ==
                        0) {   //condition for leap year
                    quantityLeapYears = (yearMax - yearMin) / 4 + 1; // leap years are repeating every 4 years
                }
                yearMin++;
            }
            System.out.println(quantityLeapYears);
        }
    }
    //End of task3 of homework;
}


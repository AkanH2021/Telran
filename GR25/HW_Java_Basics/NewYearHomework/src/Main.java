public class Main {

    public static void main(String[] args) {
        messageString();   //task 1
        System.out.println(secondTask());  //task 2
        System.out.println(speedconversion(120));  //task 3
        Printout(mb2byte(1));  //task 4
        System.out.println(bitmax(1)); //task 5
        System.out.println(thirdPow(0)); //task 6
        System.out.println(getLastDigit(2));  //task 7
        ageReturn("Валерий ", 12);  //task 8
        System.out.println(ranking(7546)); //task9
        System.out.println(hours(870));   //task 10
        System.out.println(minutes(70)); //task 11
        hours1(618); //task 12
        System.out.println(comparison("Test message 1", "test message 1")); //task 13
        System.out.println(lenghtcompare("Test string1", "Test string1")); //task 14
        System.out.println(strineven("Archimed1")); // task14a
        hellowing("guten tag");
        System.out.println(checkDebit(3185, 3000, 6.2)); //task16
        System.out.println(checkTime(12, 35)); //task17
        getMonthSwitch(8); //task18
        getMonthIf(3);  //task18a
        System.out.println(getSeasonSwitch(2)); //task19
        getSeasonIf(6);  //task19
        System.out.println(leapYear(1900)); //task 20
        System.out.println(checkDate(29, 12, 12922)); //task 21
        System.out.println(powerOfTwo(4)); //task training power


    }

    public static void messageString() {
        String str1 = "Java is easy.";
        String str2 = "Hello Java.";
        String str3 = (str2 + str1);
        System.out.println(str3);
        System.out.println(getLastDigit(2)); //task 7
    }

    public static String secondTask() {
        String str1 = "str1 ";
        String str2 = "str2 ";
        String str3 = str1;
        return str1 + str2 + str3;
    }

    public static double speedconversion(double kmH) {
        double m = kmH * 1000;
        double timesec = 3600;
        return m / timesec;
    }

    public static double mb2byte(double MB) {
        return (MB * 1024);
    }

    public static void Printout(double MB) {
        System.out.println(mb2byte(MB));
    }

    public static int bitmax(int bit) {
        int maxdigit = (int) Math.pow(2, bit);
        return maxdigit - 1;
    }

    public static int thirdPow(int n1) {
        int result = (int) Math.pow(n1, 3);
        return result;
    }

    public static int getLastDigit(int n) {
        return n % 10;
    }

    public static void ageReturn(String s, int age) {
        String t1 = " год";
        String t2 = " года";
        String t3 = " лет";
        if ((age != 11) && (age % 10 == 1)) {
            System.out.println(s + age + t1);
        }
        if (((age != 12) && (age != 13) && (age != 14)) && (age % 10 == 2 || age % 10 == 3 || age % 10 == 4)) {
            System.out.println(s + age + t2);
        } else {
            System.out.println(s + age + t3);
        }
    }

    /* Ending on 1 (except 11) - год. Example: 1 год, 21 год, 431 год etc.
    Ending on 2, 3, 4 (except 12, 13, 14) - года. Example: 2 года, 43 года, 734 года etc.
    Everything else - лет. Example: 5 лет, 11 лет, 12 лет, 17 лет, 239 лет etc.
    */
    public static int ranking(int digit) {
        int ranksum = 0;
        while (digit != 0) {
            ranksum = ranksum + digit % 10;
            digit = digit / 10;
        }
        return ranksum;
    }

    public static int hours(int minut) {
        int n1 = minut / 60;
        if (minut >= 0) {
            return n1;
        } else {
            return 0;
        }
    }

    public static int minutes(int min) {
        int n1 = min % 60;
        if (min >= 0) {
            return n1;
        } else {
            return 0;
        }
    }

    public static void hours1(int i) {
        int n1 = i / 60;
        int n2 = i % 60;
        String s1 = " hours and ";
        String s2 = " minutes";
        String s3 = n1 + s1 + n2 + s2;
        String s4 = "error argument";
        if (i >= 0) {
            System.out.println(s3);
        } else {
            System.out.println(s4);
        }
    }

    public static boolean comparison(String s1, String s2) {
        return (s1 == s2);
    }
/* variant 2:
    public static boolean comparison(String s1, String s2) {
        return (Objects.equals(s1, s2));}
    } */

    public static boolean lenghtcompare(String str1, String str2) {
        return str1.length() == str2.length();
    }

    public static boolean strineven(String strEven) {
        return strEven.length() % 2 == 0;
    }

    public static void hellowing(String str1) {
        String str2 = "hello";
        String str3 = "guten tag";
        String str4 = "unknown string";
        if (str1 == str2) {
            System.out.println(str3);
        } else if (str1 == str3) {
            System.out.println(str2);
        } else {
            System.out.println(str4);
        }
    }
/*  variant 2:
        public static void hellowing(String str1) {

        String str2 = "hello";
        String str3 = "guten tag";
        String str4 = "unknown string";
        if (Objects.equals(str1, str2)) {
            System.out.println(str3);
        } else if (Objects.equals(str1, str3)) {
            System.out.println(str2);
        } else {
            System.out.println(str4);
        }
    }
}
 */

    public static boolean checkDebit(double debitAmount, double accountAmount, double bankProcent) {
        double percentSum = (accountAmount * bankProcent) / 100;
        double minMoney = accountAmount + percentSum;
        if (debitAmount <= minMoney) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTime(int h, int m) {
        if ((h <= 12 && m <= 59) && (h >= 0 && m >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    //variant 1 (usage of switch method:)
    public static void getMonthSwitch(int month) {
        switch (month) {
            case 1: {
                System.out.println("January");
            }
            break;
            case 2: {
                System.out.println("February");
            }
            break;
            case 3: {
                System.out.println("March");
            }
            break;
            case 4: {
                System.out.println("April");
            }
            break;
            case 5: {
                System.out.println("May");
            }
            break;
            case 6: {
                System.out.println("June");
            }
            break;
            case 7: {
                System.out.println("July");
            }
            break;
            case 8: {
                System.out.println("August");
            }
            break;
            case 9: {
                System.out.println("September");
            }
            break;
            case 10: {
                System.out.println("October");
            }
            break;
            case 11: {
                System.out.println("November");
            }
            break;
            case 12: {
                System.out.println("December");
            }
            default: {
                System.out.println(" ");
            }
        }
    }

    //variant 2 (usage of if method:)
    public static void getMonthIf(int month) {
        if (month == 1) {
            System.out.println("January");
        }
        if (month == 2) {
            System.out.println("February");
        }
        if (month == 3) {
            System.out.println("March");
        }
        if (month == 4) {
            System.out.println("April");
        }
        if (month == 5) {
            System.out.println("May");
        }
        if (month == 6) {
            System.out.println("June");
        }
        if (month == 7) {
            System.out.println("July");
        }
        if (month == 8) {
            System.out.println("August");
        }
        if (month == 9) {
            System.out.println("September");
        }
        if (month == 10) {
            System.out.println("October");
        }
        if (month == 11) {
            System.out.println("November");
        }
        if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println(" ");
        }
    }

    public static String getSeasonSwitch(int month) {
        String s1 = "Winter";
        String s2 = "Spring";
        String s3 = "Summer";
        String s4 = "Autumn";

        switch (month) {
            case 1:
            case 2:
            case 12: {
                return s1;
            }
            case 3:
            case 4:
            case 5: {
                return s2;
            }
            case 6:
            case 7:
            case 8: {
                return s3;
            }
            case 9:
            case 10:
            case 11: {
                return s4;
            }
            default: {
                System.out.println(" ");
            }
        }
        return s1;
    }

    //variant 2 (usage of if method:)
    public static void getSeasonIf(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println(" ");
        }
    }

    public static boolean leapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDate(int day, int month, int year) {
        return (day <= 31 && day > 0 && month <= 12 && month > 0) && (year <= 9999) && year >= 0;
    }
    /*    public static void main(String[] args) {
        //21. *Написать метод, который принимает 3 числа int (day, month, year)
        // и выдает true если числа могут  быть интерпретированы как дата,
        // иначе false. Например:
        //checkDate(17,01,2000) -> true
        //checkDate(29,02,2017) -> false
        //checkDate(29,18,2017) -> false
        int day = 29;
        int month = 2;
        int year = 2001;
        System.out.println(checkDate(day, month, year));
    }

    public static boolean checkDate(int day, int month, int year) {
        return isYearCorrect(year) && isMonthCorrect(month) && isDayCorrect(day,month,year);
    }

    public static boolean isDayCorrect(int day, int month, int year) {
        return day>=1 && day<= getDayPerMonth(month,year);
    }

    public static int getDayPerMonth(int month, int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2: if(isLeapYear(year)){
                return 29;
            } else {
                return 28;
            }
            default: return 0;
        }
    }

    public static boolean isLeapYear(int year) {
        return year%4==0 && (year%100!=0 || year%400==0);
    }

    public static boolean isMonthCorrect(int month) {
        return month>=1&&month<=12;
    }

    public static boolean isYearCorrect(int year) {
        return year>0;
    }
}
*/

    public static int powerOfTwo(int bit) {
        int maxdigitelse = (int) Math.pow(2, bit);
        int maxdigit1 = 2;
        if (bit != 1) {
            return maxdigitelse - 1;
        } else {
            return maxdigit1;
        }
    }
}
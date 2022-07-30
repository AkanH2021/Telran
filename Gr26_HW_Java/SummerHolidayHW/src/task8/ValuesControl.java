package task8;

public class ValuesControl {

   public boolean nameCheck(String str) {
       boolean flag;
       if (str.length() <= 2) {
           System.out.println("The name is too short (min. 2 letters)");
           flag = false;
       } else {
           flag = true;
       }
       return flag;
   }

    public boolean checkDate(int day, int month, int year) {
        return isDayCorrect(day, month, year) & isMonthCorrect(month) & isYearCorrect(year) ;
    }

    public boolean isDayCorrect(int day, int month, int year) {
        boolean flag;
        if (day >= 1 && day <= getDayPerMonth(month, year)) {
            flag = true;
        } else {
            System.out.println("The day value is wrong");
            flag = false;
        }
        return flag;
    }

    public int getDayPerMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public boolean isLeapYear(int year) {
        boolean flag;
        flag = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return flag;
    }

    public boolean isMonthCorrect(int month) {
        boolean flag;
        if (month >= 1 && month <= 12) {
            flag = true;
        } else {
            System.out.println("The month is wrong");
            flag = false;
        }
        return flag;
    }

    public boolean isYearCorrect(int year) {
        boolean flag;
        if (year > 1900) {
            flag = true;
        } else {
            System.out.println("The year is wrong");
            flag = false;
        }
        return flag;
    }
}


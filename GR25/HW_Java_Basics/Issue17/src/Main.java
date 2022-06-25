public class Main {
    /* 1. Imagine you have a method doSomething() that return an integer as a result. This resultis the error code.
        Value  200 means “ok” ; 404 means «The page not found» ; 505 – “Internal error” ; 400 – “Bad Request”;
        301 – “The method was terminated” ; other – “Unknown error”.
        Implement method printResult(int code) that print the error code as a text message.For example:
        printResult(400) -> Bad Request  ; printResult(200) -> ok.
        2. Improve the alarm controller method. It should alarm in another one case if the door is open between 13
        pm and 14pm.  */
    public static void main(String[] args) {
        System.out.println("your penalty is: " + (speeding(30, 91))); //if norm = 30 (allowed normal speed)
        printResult(301);
        System.out.println(alarmControl(18, 1, 5));
    }

    public static int speeding(int norm, int measure) {
        int penalty1 = 0;
        int penalty2 = 20;
        int penalty3 = 50;
        int penalty4 = 150;
        int penalty5 = 300;
        if (measure <= norm + 10) {
            return penalty1;
        }
        if (measure <= norm + 20) {
            return penalty2;
        }
        if (measure <= norm + 40) {
            return penalty3;
        }
        if (measure <= norm + 60) {
            return penalty4;
        } else {
            return penalty5;
        }

    }
    //End of 1s task (about the speed and according penalty)

    public static void printResult(int code) {
        if (code == 200) {
            System.out.println("The method is working correctly");
        } else if (code == 404) {
            System.out.println("Page is not found");
        } else if (code == 505) {
            System.out.println("Method's internal error");
        } else if (code == 400) {
            System.out.println("Wrong inquiry");
        } else if (code == 301) {
            System.out.println("Method's work interruption");
        } else {
            System.out.println("Unrecognized method error");
        }
    }
    //End of 2nd task

//* Implement an alarm controller method. It should alarm (return true) if the door is open
//and the time is between 22 pm and 7am. It should return false otherwise. в задаче про сигнализацию добавить
// еще работу сигнализации в обед с 13-14 и в воскресенье - круглосуточно.

    // state 1 (true) - door is open, state 0 (false) - door is closed
//принимаем что с в обед с 13 до 14 часов дверь должна быть закрыта (сотрудники обедают вне офиса)
//принимаем что в воскресенье никого нет, и дверь должна быть закрыта
//принимаем что с 7 до 22 часов дверь должна быть открыта (приемный день)
    public static boolean alarmControl(int time, int state, int day) {
        if (day == 7 && state == 1) {
            return false;
        }
        if (day != 7 && time >= 13 && time <= 14) {
            return false;
        }
        return (day != 7 && time >= 7 && time <= 22) && (state == 1);
    }
}

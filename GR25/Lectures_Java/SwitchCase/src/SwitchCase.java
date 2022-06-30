public class SwitchCase {

    public static void main(String[] args) {
        int cod = doSomething();
        System.out.println("Код равен: " + cod);
        System.out.println("Это означает: " + getCode(cod));
    }

    public static int doSomething() {
        return 666;
    }

    public static String getCode(int a) {
        switch (a) {
            case 200:
                return "Код корректна";
            case 404:
                return "Страница не найдена";
            case 505:
                return "Ошибка метода";
            default:
                return "Error";
        }
    }
}
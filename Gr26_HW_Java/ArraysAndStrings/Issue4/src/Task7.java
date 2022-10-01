public class Task7 {
    /* Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
всех чисел от start до finish включительно. Например: sum(10,15) -> 75 */
    public static void main(String[] args) {
        System.out.println(sum(10, 15));
    }

    public static long sum(int start, int finish) {
        long total = 0;
        for (int i = start; i <= finish; i++) {
            total += i;
        }
        return total;
    }
}

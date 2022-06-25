import java.util.Scanner;

public class GameGuessNumber {
    private Scanner scanner;
    private int secretNumber;

    public GameGuessNumber(Scanner scanner, int secretNumber) {
        this.scanner = scanner;
        this.secretNumber = secretNumber;
    }

    public int readNumberOfAttempts() {
        System.out.println("Number of attempts is: ");
        return scanner.nextInt();
    }

    public int readNumber() {
        System.out.println("Enter your secret number");
        return scanner.nextInt();
    }

    public void guessNumber() {
        int attempts = readNumberOfAttempts();
        while (attempts > 0) {
            int number = readNumber();
            if (number == secretNumber) {
                System.out.println("You guessed the number!");
                return;
            } else {
                System.out.println("Please try again!");
                attempts--;
            }
        }
        System.out.println("Game ended");
    }

}

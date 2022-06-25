import java.util.List;

public class Main {

    public static void main(String[] args) {
        int userChoice = 1;
        Scannerable scanner;

        if (userChoice == 1) {
            scanner = new Handy();
        } else {
            scanner = new MyScanner();
        }
        System.out.println(scanDocument(scanner));
    }

    public static String scanDocument(Scannerable scanner) {
        return scanner.scan();
    }

    public static void printDocument(Printer printer, String doc) {
        printer.print(doc);
    }
}

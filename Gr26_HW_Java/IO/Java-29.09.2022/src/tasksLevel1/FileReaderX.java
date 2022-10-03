package tasksLevel1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderX {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test1.txt")) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }
            System.out.println();
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

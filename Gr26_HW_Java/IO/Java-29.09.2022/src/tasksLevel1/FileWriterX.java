package tasksLevel1;

import java.io.IOException;

public class FileWriterX {
    public static void main(String[] args) {
        String s = "96 Hours – der Countdown läuft! Das SCHENKER VISION 14 ist der neue Premium \n" +
                "-Trendsetter unter den 14-Zoll-Ultrabooks.";

        try (java.io.FileWriter writer = new java.io.FileWriter("test1.txt")) {
            writer.write(s);
            System.out.println("Done");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


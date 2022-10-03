package tasksLevel1;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(
                new FileReader("test1.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("test2.txt"))
        ) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                writer.write(symbol);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


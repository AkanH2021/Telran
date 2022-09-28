package task2;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEX {

    public static void main(String[] args) throws IOException {
        String str = "Мой государь, спешим! Драконы ночи" +
      " Сквозь облака несутся что есть мочи;" +
      " Гонец Авроры* поднял светоч свой," +
      " И призраки торопятся толпой ";

        FileWriter fileWriter = new FileWriter("task2output.txt");
        for (int i = 0; i < str.length(); i++)
            fileWriter.write(str.charAt(i));

        System.out.println("Writing successful");
        fileWriter.close();

    }
}

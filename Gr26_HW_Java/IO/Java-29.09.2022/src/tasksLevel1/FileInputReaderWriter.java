package tasksLevel1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputReaderWriter {
    public static void main(String[] args) {

        try (FileInputStream inputStream =
                     new FileInputStream("testPic.jpg");
             FileOutputStream outputStream = new FileOutputStream("testPic2.jpg")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


package task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fileReader=null;
        try
        {
            fileReader = new FileReader("task2output.txt");
        }
        catch (FileNotFoundException fnf)
        {
            System.out.println("File not found");
        }
        while (true) {
            assert fileReader != null;
            if ((ch = fileReader.read()) == -1) break;
            System.out.print((char)ch);
        }
        fileReader.close();
    }
    }


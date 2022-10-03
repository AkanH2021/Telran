package tasksLevel1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutputStream {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("ivan");
        persons.add("Maria");
        persons.add("Andrey");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("persons.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("persons.bin"))) {
            outputStream.writeObject(persons);
            System.out.println(inputStream.readObject());

        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Done");
    }
}

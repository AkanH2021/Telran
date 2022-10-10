import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    /*    По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing
         находится файл file.dat. Ваша задача скачать этот файл (кстати, вы можете сделать это из
         Java программы, но если сложно можно просто скачать). Ваша программа  должна записать в
         отдельный файл первые 601 байт, затем в отдельный файл записать следующие 57053 байта и
         оставшиеся 22494 байта записать в следующий файл. Если все сделано правильно, у вас должно получиться 3 файла.*/
    public static void main(String[] args) {
        String filePath = "exampleFile.dat";
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path path1 = Paths.get("part1.dat");
        Path path2 = Paths.get("part2.dat");
        Path path3 = Paths.get("part3.dat");
        System.out.println(bytes.length);

        byte[] bytes1 = new byte[601];
        System.arraycopy(bytes, 0, bytes1, 0, 601);
        try {
            Files.write(path1, bytes1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Part1 is written");

        byte[] bytes2 = new byte[57053];
        System.arraycopy(bytes, 601, bytes2, 0, 57053);
        try {
            Files.write(path2, bytes2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Part2 is written");

        byte[] bytes3 = new byte[22494];
        System.arraycopy(bytes, 57653, bytes3, 0, 22494);
        try {
            Files.write(path3, bytes3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Part3 is written");
    }
}



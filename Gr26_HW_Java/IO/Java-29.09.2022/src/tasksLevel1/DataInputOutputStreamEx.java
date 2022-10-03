package tasksLevel1;

import java.io.*;

public class DataInputOutputStreamEx {
    public static void main(String[] args) {
        boolean bool = true;
        double d = 123.456;
        long l = 1_000_000L;
        int i = 5476;
        byte b = 122;

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("ex1.bin"));
                DataInputStream inputStream = new DataInputStream(new FileInputStream("ex1.bin"));
             ) {

            outputStream.writeBoolean(bool);
            outputStream.writeDouble(d);
            outputStream.writeLong(l);
            outputStream.writeInt(i);
            outputStream.writeByte(b);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readByte());
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

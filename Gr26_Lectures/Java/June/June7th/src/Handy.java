public class Handy implements Scannerable{
    @Override
    public String scan() {
        System.out.println("Switch on and focus the camera");
        System.out.println("Scanning");
        return "Scanned document";
    }
}

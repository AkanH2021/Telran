public class Child extends Parent{
    String fName;

    public Child(String fName, String lName) {
        super(fName, lName);
        this.fName = fName;

    }

    @Override
    public String getfName() {
        return fName;
    }


}

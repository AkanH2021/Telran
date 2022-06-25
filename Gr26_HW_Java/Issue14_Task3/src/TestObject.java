public class TestObject {
    String testName;
    int testValue;

    public TestObject(String testName, Integer testValue) {
        this.testName = testName;
        this.testValue = testValue;
    }


    public String getTestName() {
        return testName;
    }

    public int getTestValue() {
        return this.testValue;
    }

    public void checkIntNull (TestObject o) {

        if(Integer.valueOf(getTestValue())==null)
        {
            System.out.println("Integer Is  Null");
        }
        else
        {
            System.out.println("Integer Is  Not Null");
        }

    }

}

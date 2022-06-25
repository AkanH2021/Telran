public class Dog {
    private String name;
    private int age;

    private static int counter;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Dog.counter = counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            System.out.println("Error! Negative age");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
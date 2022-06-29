public class Dog {

    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void bark() {
        System.out.println(this.name + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

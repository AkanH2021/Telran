import java.util.ArrayList;
import java.util.List;

public class Lesson_p1 {

    public static void main(String[] args) {
        Object obj = new Object();

        Person p1 = new Person("QWerty");
        System.out.println(p1.toString());

        String str = new String("123");
        Object qwe = str;

        System.out.println(qwe.toString());
        mmm(qwe);
        mmm(p1);

        List list = new ArrayList<>();
        list.add(p1);
        list.add(1);
        list.add("qwerty");
        list.add('a');
        list.get(0);

        for (Object obj1: list ) {
            if (obj1 instanceof String) {
                String str1 = (String) obj1;
                System.out.println(str1.toUpperCase());
            }
        }
   //     Object p2 = list.get(0); //if different types of Objects are inside the list;
        Person p2 = (Person)list.get(0);  //if only objects from Person class type are in the list
        System.out.println(p2.getClass().getSimpleName());
        Object p3;
   //     System.out.println(p2 instanceof String);
   //     if (p2 instanceof Person) p3=(Person) p2;
        Person p10 = new Person("asdadsf");
        Car car = new Car();

       if( p10 instanceof Car)
           System.out.println("hi");;

/* Object[] objects =list.toArray();  // здесь метод вернул массив из Object
       for (Object obj:objects) {
           System.out.println( ((Person)obj).getFirstName() ); // из obj в person

       Person[] people1 = new Person[list.size()];
       people1=list.toArray(people1);     */
    }
    public static void  mmm(Object obj) {
    }
}

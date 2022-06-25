import java.util.Iterator;

public class Main_2 {

    public static void main(String[] args) {


        MyPersonArray personArray = new MyPersonArray(new Person2[]{
                new Person2("person1"),
                new Person2("person2"),
                new Person2("person3"),
                new Person2("person4"),}
        );
        System.out.println(personArray);

        for (Object p2: personArray) {
            System.out.println(p2);
        }

        Iterator iterator = personArray.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
            break;
        }
    }


}






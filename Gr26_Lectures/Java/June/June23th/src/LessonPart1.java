import java.util.LinkedList;
import java.util.List;

public class LessonPart1 {
    public static void main(String[] args) {

        Child child = new Child("a", "a");
        Parent parent = new Parent("b", "b");
        Parent child1 = new Child("c", "c");
        Parent child2 = child;
        System.out.println(child2.getfName());


       Parent[] ar = {child, parent};
       List<String> h = new LinkedList<>();



   //     List<String>  h = new ArrayList<>();
        System.out.println("before: "+ar[0].getlName());
        System.out.println(ar[1].getlName());

        child.setlName("asdfhgf");

        System.out.println("after: "+ar[0].getlName());


    }



}

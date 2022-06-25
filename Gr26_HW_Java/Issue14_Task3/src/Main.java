import java.util.*;

public class Main {
    public static void main(String[] args) {
/* Пусть дан List Integer. Необходимо проверить, есть ли в нем такая пара чисел, что в сумме они дают
 заданное число. Задачу необходимо решить всеми известными вам способами. */
        List<Integer> intsList = new ArrayList<>();
        intsList.add(18);
        intsList.add(22);
        intsList.add(7);
        intsList.add(-3);
        intsList.add(-14);
        intsList.add(16);

        TestObject testObject1 = new TestObject("Maria", );
        TestObject testObject2 = new TestObject("Ivan" , 28);
        TestObject testObject3 = new TestObject("Maria", 0);
        TestObject testObject4 = new TestObject("Ivan" , null);
        List<TestObject> newlist = new ArrayList<>();
        newlist.add(testObject1);
        newlist.add(testObject2);
        newlist.add(testObject3);
        newlist.add(testObject4);

        testObject2.checkIntNull(testObject2);



        //  System.out.println(intsList);

        //    pairCheck(intsList, -4);
        //   System.out.println("---------");
      //  System.out.println(pairCheck1(intsList, 4));
    }

    public static void pairCheck(List<Integer> intsList, int s) {  //Method1: with simple print of elements of pairs
        int sum = 0;
        boolean exist = false;
        for (int i = 0; i < intsList.size(); i++) {
            for (int j = i + 1; j < intsList.size(); j++) {
                sum = intsList.get(i) + intsList.get(j);
                if (sum == s) {
                    exist = true;
                    System.out.println("True! Such pairs exist: [" + intsList.get(i) + ", " + intsList.get(j) + "]");
                }
            }
        }
        if (!exist) {
            System.out.println("no such pair");
        }
    }

    public static List<Integer> pairCheck1(List<Integer> integerList, int s) { //Method2: with New list creation
        List<Integer> newIntList = new ArrayList<>(integerList.size());
        if (integerList.isEmpty() || integerList == null) {
            return integerList;
        }
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                if (integerList.get(i) + integerList.get(j) == s) {
                    newIntList.add(integerList.get(i));
                    newIntList.add(integerList.get(j));
                    System.out.println("[" + integerList.get(i) + ", " + integerList.get(j) + "]");
                }
            }
        }
        if (newIntList.isEmpty()) {
            System.out.println("No such pair in the list");
        }
        return newIntList;
    }





}









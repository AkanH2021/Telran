package task1;

public class Main {
    //First level: Реализовать свой обобщенный LinkedList (методы add, метод get, remove)
    public static void main(String[] args) {
        MyCustomLinkedList<Object> list = new MyCustomLinkedList<>();
        list.addToHead(7.7);
        list.addToHead(11.23);
        list.addToHead("yuyuy");

        list.printAllElements();
        System.out.println("---------");
        System.out.println(list.get(2));
        System.out.println("---------");
        list.removeByIndex(2);
        list.printAllElements();
        System.out.println("---------");
        System.out.println(list.size());
        System.out.println("---------");

        MyCustomLinkedList<String> strList = new MyCustomLinkedList<>();
        strList.addToHead("hello");
        strList.addToHead("generics");
        strList.addToHead("list");
        strList.printAllElements();
        System.out.println("---------");
        System.out.println(strList.get(2));
        System.out.println("---------");
        strList.removeByIndex(2);
        strList.printAllElements();
        System.out.println("---------");

        MyCustomLinkedList<Integer> strList2 = new MyCustomLinkedList<>();
        strList2.addToHead(765);
        strList2.addToHead(-8754);
        strList2.addToHead(88);
        strList2.printAllElements();
        System.out.println("---------");
        System.out.println(strList2.get(2));
        System.out.println("---------");
        strList2.removeByIndex(2);
        strList2.printAllElements();
    }

}

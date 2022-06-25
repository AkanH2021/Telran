public class Main {

    public static void main(String[] args) {

/*        AddRoundBracketsToString addRoundBracketsToString=new AddRoundBracketsToString();
        System.out.println(addRoundBracketsToString.transform("hello"));*/

        TransformString ts = new TransformString();
        System.out.println(ts.transformString("hello java", new AddRoundBracketsToString()));
        System.out.println(ts.transformString("hello java", new FirstCharToUpperCase()));


    }
}
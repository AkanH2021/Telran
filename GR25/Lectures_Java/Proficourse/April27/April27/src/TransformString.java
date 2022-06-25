public class TransformString {

    public String transformString(String str,  Transformer action) {
       return action.transform(str);

    }



}

package transformer_interfaces;

public interface WordChecker {

    boolean check(String word);         //man muss nicht public schreiben denn ---> interface ist immer public

    String transform(String word);


}

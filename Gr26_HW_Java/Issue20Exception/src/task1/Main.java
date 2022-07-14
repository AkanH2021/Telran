package task1;

import task1.ListConvert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* Есть List<String>. Все элементы в нем должны быть строки-целые числа вида “231”,
       но некоторые данные повреждены (например, содержат символы). Необходимо преобразовать
       данный список в List<Integer>. При этом вывести на экран детализированный список «ошибок» т.е.
       в каких ячейках и какие значения не были преобразованы.
        Подсказка: необходимо использовать метод Integer.parseInt и обрабатывать его эксэпшены.  */
        List<String> inputList = new ArrayList<>();
        inputList.add("231");
        inputList.add("2@1");
        inputList.add("3465");
        inputList.add("264");
        inputList.add("64a");

        ListConvert convertationOfListValues = new ListConvert(inputList);
        convertationOfListValues.parsing(inputList);
    }

}
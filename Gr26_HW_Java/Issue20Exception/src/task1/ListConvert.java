package task1;

import java.util.ArrayList;
import java.util.List;

public class ListConvert {
    private List<String> inputList;

    public ListConvert(List<String> inputList) {
        this.inputList = inputList;
    }

    public List<String> getInputList() {
        return inputList;
    }

    public void parsing(List<String> inputList) {
        List<Integer> correctElements = new ArrayList<>();
        List<Object> wrongElements = new ArrayList<>();

        for (int i = 0; i < getInputList().size(); i++) {
            try {
                correctElements.add(Integer.parseInt(getInputList().get(i), 10));
            } catch (Exception ex) {
                wrongElements.add(getInputList());
                System.out.println("Wrong elements: " + getInputList().get(i) + " index: " + i);
            }
        }
        System.out.println("The correct elements are: " + correctElements);
    }
}


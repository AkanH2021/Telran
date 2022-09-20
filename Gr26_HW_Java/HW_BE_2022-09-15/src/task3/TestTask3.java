package task3;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static task3.Main.task3;
public class TestTask3 {
    @Test
    public void makeMapOfBest3StudentsfromGroups() {
        Student[] arr1 = {new Student("Ivan", "Ivanov", 4.2), new Student("Alex", "Alexeev", 6.0),
                new Student("Nikita", "Nikitin", 7.1), new Student("Marina", "Moiseeva", 7.0)};
        Student[] arr2 = {new Student("Anna", "Mikhaylova", 5.5), new Student("Stepan", "Stepanov", 3.7),
                new Student("Xenia", "Belyaeva", 8.8), new Student("Andrey", "Andreev", 8.1)};
        Student[] arr3 = {new Student("Irina", "Mikheeva", 9.8), new Student("Vitaly", "Lenin", 4.7),
                new Student("Misha", "Andreev", 8.1), new Student("Irina", "Petrova", 9.3)};
        Group group1 = new Group("Informatics", arr1);
        Group group2 = new Group("Mathematics", arr2);
        Group group3 = new Group("Programming", arr3);
        List<Group> groupList = List.of(group1, group2, group3);

        Map<String, Double> resultExpected = Map.of("Alexeev A.",6.0, "Belyaeva X.",8.8, "Mikheeva I.", 9.8,
                "Petrova I.",9.3, "Nikitin N.",7.1, "Andreev A.", 8.1, "Mikhaylova A.",5.5,
                "Moiseeva M.",7.0, "Andreev M.",8.1);
        assertEquals(resultExpected, task3(groupList, 3));

        
    }
}
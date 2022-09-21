package task2;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static task2.Main.task2;

public class TestTask2 {
    @Test
    public void shouldMakeListOfPersonsWithAgeTest() {
        List<Person> beatles = List.of(new Person("John", "Lennon", 23),
                new Person("Paul", "McCartney", 21),
                new Person("Ringo", "Starr", 23),
                new Person("George", "Harrison", 20));
        Map<String, Integer> personsMapExpected = Map.of("Lennon J.", 23, "McCartney P.", 21, "Harrison G.", 20, "Starr R.", 23);
        assertEquals(personsMapExpected, task2(beatles));
    }
}
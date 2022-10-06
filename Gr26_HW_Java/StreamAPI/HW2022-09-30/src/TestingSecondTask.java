import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestingSecondTask {
    @Test
    void getNamesAsKeyAndSumOfValues() {
        List<String> stringList = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");
            Map<String, Double> map = Map.of("Nick", 220.5, "Jack", 2410.2);
            assertEquals(map, Task2.task2(stringList));
    }
}
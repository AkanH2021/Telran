package task1;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static task1.Main.task1b;

public class TestTask1 {

    @Test
    public void task1Test() {
        String example = "Jack room 10 Nick room 20 Jack room 1 Mike room 3";
        Map<String, Integer> map = Map.of("1", 1, "3", 1, "Nick", 1, "Jack", 2, "room", 4, "20", 1, "10", 1, "Mike", 1);
        assertEquals(map, task1b(example));
    }

}

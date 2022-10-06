import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestingFirstTask {
    @Test
    void getSymbolAsKeyAndDigitsAsListValues() {
        List<String> list = List.of("a:11", "b:22", "a:13", "c:20", "a:10");
        Map<String, List<Integer>> map = Map.of("a", List.of(11, 13, 10),
                "b", List.of(22), "c", List.of(20));
        assertEquals(map, Task1.task1(list));
    }
}

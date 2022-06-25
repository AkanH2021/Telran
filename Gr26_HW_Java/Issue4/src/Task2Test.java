import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {


    @Test
    public void areTwoDigitDivisibleWithoutRemain() {
        Assertions.assertFalse(Task2.isDivisible(20,7));
        Assertions.assertTrue(Task2.isDivisible(21, 7));
    }
}

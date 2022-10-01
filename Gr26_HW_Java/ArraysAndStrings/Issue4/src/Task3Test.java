import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {


    @Test
    public void twoDigitsdivisibleToThirdDigitTest(){
        Assertions.assertTrue(Task3.comparingThreeDigits(15, 50, 1));
        Assertions.assertFalse(Task3.comparingThreeDigits(15, 50, 4));
    }
}

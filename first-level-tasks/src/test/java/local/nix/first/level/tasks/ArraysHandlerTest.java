package local.nix.first.level.tasks;

import local.nix.first.level.tasks.arraysHandler.ArraysHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysHandlerTest {

    @Test
    public void getAmountOfUniqueNumbersTest() {

        Integer[] testArray = {1, 4, 5, 1, 1, 3};
        Integer[] testArray1 = {1, 5, 3, 3, 3, 7};

        assertEquals(ArraysHandler.getAmountOfUniqueNumbers(testArray), 4);
        assertEquals(ArraysHandler.getAmountOfUniqueNumbers(testArray1), 4);
    }
}

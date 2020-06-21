package local.nix.second.level.task;

import local.nix.second.level.tasks.stringHandler.StringHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringHandlerTest {

    @Test
    public void checkIfStringIsCorrectTest() {

        String s = "Давайте {[проверим] работу (нашей) программы}";


        String s1 = "Это {некорректая строка )))";

        String s2 = "";

        String s3 = "Это [(неправильная]) [(строка])";
        String s4 = "Это [( тоже  [(неправильная)] строка ))";

        String s5 = "Это {[[правильная]] (строка)} ";

        assertTrue(StringHandler.checkIfStringIsCorrect(s));
        assertFalse(StringHandler.checkIfStringIsCorrect(s1));
        assertTrue(StringHandler.checkIfStringIsCorrect(s2));
        assertFalse(StringHandler.checkIfStringIsCorrect(s3));
        assertFalse(StringHandler.checkIfStringIsCorrect(s4));
        assertTrue(StringHandler.checkIfStringIsCorrect(s5));

    }
}

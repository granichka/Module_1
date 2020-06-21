package local.nix.first.level.tasks;

import local.nix.first.level.tasks.horseStepChecker.Horse;
import local.nix.first.level.tasks.horseStepChecker.HorseStepChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HorseStepCheckerTest {

    @Test
    public void checkHorseStepTest() {

        Horse test = new Horse(0, 0);
        int newX = 0;
        int newY = -2;

        int newX1 = 2;
        int newY1 = 1;

        assertFalse(HorseStepChecker.checkHorseStep(test.getX(), test.getY(), newX, newY));
        assertTrue(HorseStepChecker.checkHorseStep(test.getX(), test.getY(), newX1, newY1));
    }

}

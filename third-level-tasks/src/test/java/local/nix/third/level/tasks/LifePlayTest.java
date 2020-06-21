package local.nix.third.level.tasks;

import local.nix.third.level.tasks.lifePlay.LifePlay;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LifePlayTest {

    @Test
    public void playTest() {

        int[][] arr = {{0, 1, 1},
                {0, 0, 1},
                {0, 0, 1}};

        assertEquals(LifePlay.play(arr)[0][0], 0);
        assertEquals(LifePlay.play(arr)[0][1], 1);
        assertEquals(LifePlay.play(arr)[0][2], 1);
        assertEquals(LifePlay.play(arr)[1][0], 0);
        assertEquals(LifePlay.play(arr)[1][1], 0);
        assertEquals(LifePlay.play(arr)[1][2], 1);
        assertEquals(LifePlay.play(arr)[2][0], 0);
        assertEquals(LifePlay.play(arr)[2][1], 0);
        assertEquals(LifePlay.play(arr)[2][2], 1);

    }

    @Test
    public void playTest2() {

        int[][] arr = {{0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0}};

        assertEquals(LifePlay.play(arr)[0][0], 0);
        assertEquals(LifePlay.play(arr)[0][1], 1);
        assertEquals(LifePlay.play(arr)[0][2], 0);
        assertEquals(LifePlay.play(arr)[0][3], 0);
        assertEquals(LifePlay.play(arr)[0][4], 0);
        assertEquals(LifePlay.play(arr)[1][0], 0);
        assertEquals(LifePlay.play(arr)[1][1], 0);
        assertEquals(LifePlay.play(arr)[1][2], 0);
        assertEquals(LifePlay.play(arr)[1][3], 1);
        assertEquals(LifePlay.play(arr)[1][4], 0);
        assertEquals(LifePlay.play(arr)[2][0], 0);
        assertEquals(LifePlay.play(arr)[2][1], 0);
        assertEquals(LifePlay.play(arr)[2][2], 0);
        assertEquals(LifePlay.play(arr)[2][3], 0);
        assertEquals(LifePlay.play(arr)[2][4], 0);

    }
}

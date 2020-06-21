package local.nix.first.level.tasks;

import local.nix.first.level.tasks.triangleHandler.Point;
import local.nix.first.level.tasks.triangleHandler.TriangleHandler;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleHandlerTest {

    @Test
    public void getSquareOfTriangleOnPointsTest() {

        Point A = new Point(-3, 0);
        Point B = new Point(2, 5);
        Point C = new Point(4, 0);

        assertEquals((int) TriangleHandler.getSquareOfTriangleOnPoints(A, B, C), 17);
    }


}

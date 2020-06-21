package local.nix.first.level.tasks.triangleHandler;

public class DistanceFinder {

    public static double findDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {

        double result = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return result;
    }

}

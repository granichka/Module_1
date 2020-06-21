package local.nix.first.level.tasks.triangleHandler;

public class TriangleHandler {

    public static double getSquareOfTriangleOnPoints(Point A, Point B, Point C) {

        double AB = DistanceFinder.findDistanceBetweenTwoPoints(A.getX(), A.getY(), B.getX(), B.getY());
        double AC = DistanceFinder.findDistanceBetweenTwoPoints(A.getX(), A.getY(), C.getX(), C.getY());
        double BC = DistanceFinder.findDistanceBetweenTwoPoints(B.getX(), B.getY(), C.getX(), C.getY());

        double S = SquareFinder.findSquare(AB, AC, BC);

        return S;

    }
}

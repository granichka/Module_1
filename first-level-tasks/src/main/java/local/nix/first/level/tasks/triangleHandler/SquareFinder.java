package local.nix.first.level.tasks.triangleHandler;

public class SquareFinder {

    public static double findSquare(double a, double b, double c) {

        double p = (a + b + c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}

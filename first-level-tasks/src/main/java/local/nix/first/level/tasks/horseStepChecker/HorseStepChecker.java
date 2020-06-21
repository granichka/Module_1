package local.nix.first.level.tasks.horseStepChecker;

public class HorseStepChecker {

    public static boolean checkHorseStep(int currentX, int currentY, int newX, int newY) {

        boolean result = false;

        if(newX == currentX || newY == currentY) { return result; }

        if(Math.abs(newX - currentX)>2 || Math.abs(newY - currentY)>2) {
            return result;
        }

        if(Math.abs(newX - currentX) == 1) {
            if(Math.abs(newY - currentY) != 2) {
                return result;
            }

        } else if (Math.abs(newX - currentX) == 2) {
            if(Math.abs(newY - currentY) != 1) {
                return result;
            }
        }

        result = true;
        return result;

    }
}

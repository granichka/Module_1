package local.nix.first.level.tasks.arraysHandler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysHandler {

    public static int getAmountOfUniqueNumbers(Integer[] arr) {

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        return set.size();
    }
}

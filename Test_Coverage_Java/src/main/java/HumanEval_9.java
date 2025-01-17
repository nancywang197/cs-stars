import java.util.*;

public class HumanEval_9 {
    public static List<Integer> rollingMax(int[] numbers) {
        if (numbers.length == 0) {
            return Collections.emptyList();
        }

        int runningMax = numbers[0];
        List<Integer> result = new ArrayList<>();

        for (int n : numbers) {
            result.add(runningMax);
            runningMax = Math.max(runningMax, n);
        }

        // add the last value to the result list
        result.add(runningMax);

        return result;
    }
}
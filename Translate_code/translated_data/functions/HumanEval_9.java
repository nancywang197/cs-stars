import java.util.ArrayList;
import java.util.List;

class HumanEval_9 {
    /**
     * Given a list of integers, return a list of integers where each element is the maximum value seen so far.
     *
     * @param numbers The input list of integers.
     * @return A list of integers where each element is the maximum value seen so far.
     */
    public List<Integer> rollingMax(List<Integer> numbers) {
        Integer runningMax = null;
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (runningMax == null) {
                runningMax = n;
            } else {
                runningMax = Math.max(runningMax, n);
            }

            result.add(runningMax);
        }

        return result;
    }
}

import java.util.List;
import java.util.ArrayList;

class HumanEval_21 {
    /**
     * Given a list of floats, rescale them to the range [0, 1].
     *
     * @param numbers The list of floats to rescale.
     * @return A new list of floats, rescaled to the range [0, 1].
     */
    public List<Float> rescale_to_unit(List<Float> numbers) {
        float min_number = Float.MAX_VALUE;
        float max_number = Float.MIN_VALUE;

        for (float num : numbers) {
            min_number = Math.min(min_number, num);
            max_number = Math.max(max_number, num);
        }

        List<Float> result = new ArrayList<>();
        for (float x : numbers) {
            if (max_number - min_number == 0) {
                result.add(0.0f); //Handle case where all numbers are the same.
            } else {
                result.add((x - min_number) / (max_number - min_number));
            }
        }
        return result;
    }
}

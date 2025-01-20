import java.util.ArrayList;
import java.util.List;

class HumanEval_142 {
    /**
     * Given a list of integers, calculate the sum of the elements based on their index.
     * If the index is divisible by 3, square the element.
     * If the index is divisible by 4 but not by 3, cube the element.
     * Otherwise, keep the element as is.
     * Return the sum of the modified elements.
     *
     * @param lst The input list of integers.
     * @return The sum of the modified elements.
     */
    public int sum_squares(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add((int) Math.pow(lst.get(i), 2));
            } else if (i % 4 == 0 && i % 3 != 0) {
                result.add((int) Math.pow(lst.get(i), 3));
            } else {
                result.add(lst.get(i));
            }
        }
        int sum = 0;
        for (int num : result) {
            sum += num;
        }
        return sum;
    }
}

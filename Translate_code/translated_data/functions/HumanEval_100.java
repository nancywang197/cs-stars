import java.util.ArrayList;
import java.util.List;

class HumanEval_100 {
    /**
     * Given an integer n, return a list of integers where the first element is n, and each subsequent element is 2 greater than the previous element.  The list should have n elements.
     *
     * @param n The number of elements in the list.
     * @return A list of integers.
     */
    public List<Integer> make_a_pile(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(n + 2 * i);
        }
        return result;
    }
}

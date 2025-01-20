import java.util.ArrayList;
import java.util.List;

class HumanEval_25 {
    /**
     * Given an integer n, return its prime factorization.
     *
     * @param n The integer to factorize.
     * @return A list of integers representing the prime factorization of n.
     */
    public List<Integer> factorize(int n) {
        List<Integer> fact = new ArrayList<>();
        int i = 2;
        while (i <= (int) Math.sqrt(n) + 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        if (n > 1) {
            fact.add(n);
        }
        return fact;
    }
}

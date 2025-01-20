import java.util.ArrayList;
import java.util.List;

class HumanEval_96 {
    /**
     * Given an integer n, return a list of primes up to n.
     *
     * @param n the upper bound (exclusive)
     * @return a list of primes up to n
     */
    public List<Integer> countUpTo(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}

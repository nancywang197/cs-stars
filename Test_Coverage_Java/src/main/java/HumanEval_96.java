import java.util.ArrayList;

public class HumanEval_96 {
    public static ArrayList<Integer> countUpTo(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) { // optimized the inner loop
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
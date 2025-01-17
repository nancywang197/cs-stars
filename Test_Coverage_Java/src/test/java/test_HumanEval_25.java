import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HumanEval_25Test {

    @Test
    public void test_HumanEval_25() {
        int[] expected1 = {2};
        int result1 = factorize(2);
        assertArrayEquals(expected1, result1);

        int[] expected2 = {2, 2};
        int result2 = factorize(4);
        assertArrayEquals(expected2, result2);

        int[] expected3 = {2, 2, 2};
        int result3 = factorize(8);
        assertArrayEquals(expected3, result3);

        int[] expected4 = {3, 19};
        int result4 = factorize(3 * 19);
        assertArrayEquals(expected4, result4);

        int[] expected5 = {3, 3, 19, 19};
        int result5 = factorize(3 * 19 * 3 * 19);
        assertArrayEquals(expected5, result5);

        int[] expected6 = {3, 3, 3, 19, 19, 19};
        int result6 = factorize(3 * 19 * 3 * 19 * 3 * 19);
        assertArrayEquals(expected6, result6);

        int[] expected7 = {3, 19, 19, 19};
        int result7 = factorize(3 * 19 * 19 * 19);
        assertArrayEquals(expected7, result7);

        int[] expected8 = {2, 3, 3};
        int result8 = factorize(3 * 2 * 3);
        assertArrayEquals(expected8, result8);
    }

    // Assuming the function factorize is implemented in a separate class
    public static class HumanEval_25 {
        public static int[] factorize(int n) {
            // Implementation of the factorize function
            // For this example, we will use a simple trial division method
            int i = 2;
            int[] factors = new int[0];
            while (i * i <= n) {
                if (n % i == 0) {
                    int count = 0;
                    while (n % i == 0) {
                        n /= i;
                        count++;
                    }
                    // Add the factor to the array
                    factors = addFactor(factors, i, count);
                }
                i++;
            }
            if (n > 1) { // If n is still greater than 1, it means it's a prime number
                int[] temp = new int[factors.length + 1];
                System.arraycopy(factors, 0, temp, 0, factors.length);
                temp[factors.length] = n;
                factors = temp;
            }
            return factors;
        }

        private static int[] addFactor(int[] factors, int factor, int count) {
            int[] newFactors = new int[factors.length + count];
            System.arraycopy(factors, 0, newFactors, 0, factors.length);
            for (int i = 0; i < count; i++) {
                newFactors[factors.length + i] = factor;
            }
            return newFactors;
        }
    }
}
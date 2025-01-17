public class Main {
    /**
     * Returns the largest divisor of a given number.
     *
     * @param n The input number.
     * @return The largest divisor of n.
     */
    public static int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        throw new IllegalArgumentException("Input number is not divisible by any other number");
    }

     catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
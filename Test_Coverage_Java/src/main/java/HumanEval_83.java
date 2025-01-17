public class Main {
    /**
     * Calculates the value of a sequence where each term is 18 times the previous term,
     * starting from 10 raised to the power of n-2, minus one.
     *
     * @param n the index of the term in the sequence (starting from 1)
     * @return the nth term in the sequence
     */
    public static int startsOne Ends(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 18 * (int) Math.pow(10, n - 2);
        }
    }

    
}
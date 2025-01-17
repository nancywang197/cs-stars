public class HumanEval_139 {

    /**
     * Calculates the special factorial of a given number.
     *
     * @param n The input number.
     * @return The special factorial of the input number.
     */
    public static long specialFactorial(int n) {
        long factI = 1;
        long specialFact = 1;

        for (int i = 1; i <= n; i++) {
            factI *= i;
            specialFact *= factI;
        }

        return specialFact;
    }

    
}
public class Main {
    /**
     * Calculates the Greatest Common Divisor of two numbers.
     * 
     * @param a The first number.
     * @param b The second number.
     * @return The Greatest Common Divisor of a and b.
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
}
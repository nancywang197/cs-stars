public class HumanEval_31 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int k = 2; k <= n / 2; k++) {
            if (n % k == 0) {
                return false;
            }
        }
        return true;
    }

    
}
public class HumanEval_75 {

    private static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    

    public static boolean isMultiplyPrime(int a) {
        for (int i = 2; i < 101; i++) {
            if (!isPrime(i)) continue;
            for (int j = 2; j < 101; j++) {
                if (!isPrime(j)) continue;
                for (int k = 2; k < 101; k++) {
                    if (!isPrime(k)) continue;
                    if (i * j * k == a) return true;
                }
            }
        }
        return false;
    }
}
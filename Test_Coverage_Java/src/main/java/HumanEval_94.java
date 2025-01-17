public class HumanEval_94 {


    public static long skjjakasd(int[] lst) {
        boolean isPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        int maxx = 0;
        for (int num : lst) {
            if (num > maxx && isPrime(num)) {
                maxx = num;
            }
        }

        long result = sumDigits(maxx);
        return result;
    }

    private static long sumDigits(int number) {
        long sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
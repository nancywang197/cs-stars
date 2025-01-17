public class HumanEval_131 {
    public static long digits(long n) {
        long product = 1;
        int oddCount = 0;
        for (long digit : String.valueOf(n)) {
            long intDigit = Long.parseLong(String.valueOf(digit));
            if (intDigit % 2 == 1) {
                product *= intDigit;
                oddCount++;
            }
        }
        if (oddCount == 0) {
            return 0;
        } else {
            return product;
        }
    }

    
}
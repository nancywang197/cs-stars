public class HumanEval_78 {
    private static final String PRIMES = "2,3,5,7,B,D";

    public static int hexKey(String num) {
        int count = 0;
        for (char c : num.toCharArray()) {
            if (PRIMES.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    
}
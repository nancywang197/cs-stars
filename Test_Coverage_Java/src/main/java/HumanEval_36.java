public class Main {

    /**
     * This method calculates the total number of occurrences of '7' 
     * in the FizzBuzz sequence up to n, where if a number i is divisible by 11 or 13,
     * it should be replaced with '7'.
     *
     * @param n The upper limit for generating the FizzBuzz sequence.
     * @return The total count of occurrences of '7' in the generated sequence.
     */
    public static int fizzBuzz(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                sb.append('7');
            } else {
                sb.append(i);
            }
            sb.append(" ");
        }

        String str = sb.toString().trim();
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7') {
                ans++;
            }
        }
        return ans;
    }

    
}
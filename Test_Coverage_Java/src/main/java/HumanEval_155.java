public class Main {
    

    /**
     * Counts the occurrences of even and odd digits in a given number.
     *
     * @param num The input number.
     * @return An array containing two integers, representing the count of even and odd digits respectively.
     */
    public static int[] evenOddCount(int num) {
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();
        int evenCount = 0;
        int oddCount = 0;

        for (char c : digits) {
            if ((c - '0') % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }
}
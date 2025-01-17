public class Main {

    /**
     * This method calculates the sum of squares, cubes or the number itself from a given list.
     * It checks if the index is divisible by 3 (for squares), 
     * and if it's divisible by 4 but not by 3 (for cubes).
     *
     * @param lst The input array of numbers
     * @return The sum of calculated values
     */
    public static int sumSquares(int[] lst) {
        int result = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i % 3 == 0) {
                result += Math.pow(lst[i], 2);
            } else if (i % 4 == 0 && i % 3 != 0) {
                result += Math.pow(lst[i], 3);
            } else {
                result += lst[i];
            }
        }
        return result;
    }

}
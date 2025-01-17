import java.lang.Math;

public class Main {
    ;
        System.out.println(sumSquares(numbers));
    }

    /**
     * Calculate the sum of squares for a given list of integers.
     *
     * @param lst The input list of integers
     * @return The sum of squares
     */
    public static int sumSquares(int[] lst) {
        int squared = 0;
        for (int i : lst) {
            squared += Math.ceil(i) * Math.ceil(i);
        }
        return squared;
    }
}
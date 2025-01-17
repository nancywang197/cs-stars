public class MedianCalculator {

    /**
     * Calculates the median of a sorted list.
     *
     * @param list The input list to calculate the median from.
     * @return The median of the list.
     */
    public static double calculateMedian(double[] list) {
        int n = list.length;
        if (n % 2 == 0) {
            // For even length lists, return the average of two middle numbers
            return (list[n / 2 - 1] + list[n / 2]) / 2.0;
        } else {
            // For odd length lists, return the middle number
            return list[n / 2];
        }
    }

    ;
        System.out.println("Median: " + calculateMedian(numbers));
    }
}
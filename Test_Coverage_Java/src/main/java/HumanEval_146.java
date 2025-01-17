public class Main {
    ;
        System.out.println(specialFilter(nums));
    }

    /**
     * Counts numbers in the array where both the first and last digits are odd.
     *
     * @param nums an array of integers
     * @return count of special numbers
     */
    public static int specialFilter(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 10) {
                String numberStr = Integer.toString(num);
                if ((Character.getNumericValue(numberStr.charAt(0))) % 2 == 1 
                    && (Character.getNumericValue(numberStr.charAt(numberStr.length() - 1)) % 2 == 1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
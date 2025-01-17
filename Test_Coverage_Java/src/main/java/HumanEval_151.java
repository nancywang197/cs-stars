public class HumanEval_151 {
    public static int doubleTheDifference(int[] lst) {
        // Filter out non-integer, negative numbers and those that contain a decimal point
        int sum = 0;
        for (int i : lst) {
            if (i > 0 && String.valueOf(i).split("\\.")[0].matches("[^\\.]+")) {
                sum += Math.pow(i, 2);
            }
        }

        return sum;
    }

}
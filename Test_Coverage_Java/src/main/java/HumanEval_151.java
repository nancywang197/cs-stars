public class Main {
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

    ;
        System.out.println(doubleTheDifference(testCases)); // prints: 10

        int[] testCase2 = {-1, -2, 0};
        System.out.println(doubleTheDifference(testCase2)); // prints: 0

        int[] testCase3 = {9, -2};
        System.out.println(doubleTheDifference(testCase3)); // prints: 81

        int[] testCase4 = {0};
        System.out.println(doubleTheDifference(testCase4)); // prints: 0
    }
}
public class Main {
    public static int countPositiveNumbers(int[] arr) {
        // Helper method to calculate the sum of digits of a number
        private static int sumOfDigits(int num) {
            int sign = 1;
            if (num < 0) {
                num = -num;
                sign = -1;
            }
            String strNum = Integer.toString(num);
            char[] chars = strNum.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int digit = Math.abs(chars[i] - '0');
                num -= digit * sign;
            }
            return num;
        }

        // Filter and count positive numbers
        int count = 0;
        for (int num : arr) {
            if (sumOfDigits(num) > 0) {
                count++;
            }
        }
        return count;
    }

    ;
        System.out.println(countPositiveNumbers(array)); // Output: 3
    }
}
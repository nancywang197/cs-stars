class HumanEval_146 {
    /**
     * Given a list of numbers, count how many numbers are greater than 10 and have both the first and last digit odd.
     *
     * @param nums The input list of numbers.
     * @return The count of numbers that satisfy the condition.
     */
    public int specialFilter(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 10) {
                int[] odd_digits = {1, 3, 5, 7, 9};
                String number_as_string = String.valueOf(num);
                int firstDigit = Integer.parseInt(String.valueOf(number_as_string.charAt(0)));
                int lastDigit = Integer.parseInt(String.valueOf(number_as_string.charAt(number_as_string.length() - 1)));

                boolean firstDigitOdd = false;
                for (int digit : odd_digits) {
                    if (firstDigit == digit) {
                        firstDigitOdd = true;
                        break;
                    }
                }

                boolean lastDigitOdd = false;
                for (int digit : odd_digits) {
                    if (lastDigit == digit) {
                        lastDigitOdd = true;
                        break;
                    }
                }

                if (firstDigitOdd && lastDigitOdd) {
                    count++;
                }
            }
        }
        return count;
    }
}

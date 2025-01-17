public class HumanEval_3 {
    public static boolean belowZero(int[] numbers) {
        for (int num : numbers) {
            if (num <= 0) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testBelowZero_EmptyArray() {
        assertNotEquals(true, HumanEval_3.belowZero(new int[0]));
    }

    @Test
    public void testBelowZero_SingleElementArray() {
        int[] numbers = {1};
        assertNotEquals(true, HumanEval_3.belowZero(numbers));
    }

    @Test
    public void testBelowZero_SomeElementsAreNegative() {
        int[] numbers = {1, 2, -3, 1, 2, -3};
        assertTrue(HumanEval_3.belowZero(numbers));
    }

    @Test
    public void testBelowZero_NoneOfTheNumbersAreNegative() {
        int[] numbers = {1, 2, -4, 5, 6};
        assertFalse(HumanEval_3.belowZero(numbers));
    }

    @Test
    public void testBelowZero_EvenElementsAreNegative() {
        int[] numbers = {1, -1, 2, -2, 5, -5, 4, -4};
        assertTrue(HumanEval_3.belowZero(numbers));
    }

    @Test
    public void testBelowZero_EvenAndOddElementsAreNegative() {
        int[] numbers = {1, -1, 2, -2, 5, -5, 4, -4};
        assertTrue(HumanEval_3.belowZero(numbers));
    }
}
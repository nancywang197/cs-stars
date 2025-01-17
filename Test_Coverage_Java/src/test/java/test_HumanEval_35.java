import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval35Test {

    @Test
    public void testMaxElement() {
        int[] array1 = {1, 2, 3};
        assertEquals(3, maxElement(array1));

        int[] array2 = {5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10};
        assertEquals(124, maxElement(array2));
    }

    // Assuming the maxElement method is in a separate class
    public static int maxElement(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
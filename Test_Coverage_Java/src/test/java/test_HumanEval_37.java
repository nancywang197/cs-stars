import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval37Test {

    @Test
    public void testSortEven() {
        int[] numbers = {1, 2, 3};
        int[] result = sortEven(numbers);
        assertEquals(intArrayToString(numbers), intArrayToString(result));

        numbers = new int[]{5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10};
        result = sortEven(numbers);
        assertEquals(intArrayToString(numbers), intArrayToString(result));

        numbers = new int[]{5, 8, -12, 4, 23, 2, 3, 11, 12, -10};
        result = sortEven(numbers);
        assertEquals(intArrayToString(numbers), intArrayToString(result));
    }

    private String intArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(",");
        }
        return sb.toString().replaceAll(",$", "");
    }

    private boolean sortEven(int[] numbers) {
        if (numbers.length < 2) {
            return true;
        }

        int n = numbers.length;
        for (int i = 0; i + 1 < n; i++) {
            if ((numbers[i] & 1) == 0 && (numbers[i + 1] & 1) != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        for (int i = 0; i + 1 < n; i++) {
            if ((numbers[i] & 1) == 0 && (numbers[i + 1] & 1) != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        return true;
    }
}
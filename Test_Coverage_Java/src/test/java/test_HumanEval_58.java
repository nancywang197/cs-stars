import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_58 {

    @Test
    public void test_HumanEval_58() {
        String[] expected = {"1", "5", "653"};
        String[] input1 = {"1", "4", "3", "34", "653", "2", "5"};
        String[] input2 = {"5", "7", "1", "5", "9", "653", "121"};
        
        String[] result1 = HumanEval_58.common(input1, input2);
        assertArrayEquals(expected, result1);

        expected = new String[]{"2", "3"};
        input1 = new String[]{"5", "3", "2", "8"};
        input2 = new String[]{"3", "2"};

        String[] result2 = HumanEval_58.common(input1, input2);
        assertArrayEquals(expected, result2);

        expected = new String[]{"2", "3", "4"};
        input1 = new String[]{"4", "3", "2", "8"};
        input2 = new String[]{"3", "2", "4"};

        String[] result3 = HumanEval_58.common(input1, input2);
        assertArrayEquals(expected, result3);

        expected = new String[]{};
        input1 = new String[]{"4", "3", "2", "8"};
        input2 = new String[]{};

        String[] result4 = HumanEval_58.common(input1, input2);
        assertArrayEquals(expected, result4);
    }

    public static String[] common(String[] input1, String[] input2) {
        // implementation of the common function goes here
        return new String[]{"Implementation"};
    }
}
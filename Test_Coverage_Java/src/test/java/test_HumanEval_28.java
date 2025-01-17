import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval28Test {

    @Test
    public void test_HumanEval_28() {
        String[] input1 = {};
        assertEquals("", concatenate(input1));

        String[] input2 = {"x", "y", "z"};
        assertEquals("xyz", concatenate(input2));

        String[] input3 = {"x", "y", "z", "w", "k"};
        assertEquals("xyzwk", concatenate(input3));
    }
}
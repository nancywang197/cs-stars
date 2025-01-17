import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_95Test {

    @Test
    public void test_HumanEval_95() {
        
        // Check some simple cases
        assertTrue(checkDictCase({"p":"pineapple", "b":"banana"}));
        assertFalse(checkDictCase({"p":"pineapple", "A":"banana", "B":"banana"}));
        assertFalse(checkDictCase({"p":"pineapple", 5:"banana", "a":"apple"}));
        assertFalse(checkDictCase({"Name":"John", "Age":"36", "City":"Houston"}));
        assertTrue(checkDictCase({"STATE":"NC", "ZIP":"12345" }));
        assertTrue(checkDictCase({"fruit":"Orange", "taste":"Sweet"}));
        
        // Check some edge cases that are easy to work out by hand.
        assertFalse(checkDictCase({}));
    }

    @Test
    public void test_InvalidKey() {
        assertThrows(Exception.class, () -> checkDictCase({"p":"pineapple", 5:"banana"}));
    }
}
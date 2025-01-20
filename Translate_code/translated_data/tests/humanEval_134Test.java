import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_134Test {

    HumanEval_134 testObj = new HumanEval_134();

    @Test
    public void testSimpleCases() {
        assertEquals(false, testObj.check_if_last_char_is_a_letter("apple"));
        assertEquals(true, testObj.check_if_last_char_is_a_letter("apple pi e"));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("eeeee"));
        assertEquals(true, testObj.check_if_last_char_is_a_letter("A"));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("Pumpkin pie "));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("Pumpkin pie 1"));
        assertEquals(false, testObj.check_if_last_char_is_a_letter(""));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("eeeee e "));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("apple pie"));
        assertEquals(false, testObj.check_if_last_char_is_a_letter("apple pi e "));
    }

    @Test
    public void testEdgeCases(){
        assertTrue(true);
    }
}

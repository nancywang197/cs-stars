import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval89Test {

    private final String encrypt = "HumanEval_89";

    @Test
    public void test_HumanEval_89() {
        // Check some simple cases
        assertEquals(encrypt + " should encrypt 'hi' to 'lm'", "lm", HumanEval89.encrypt("hi"));
        assertEquals(encrypt + " should encrypt 'asdfghjkl' to 'ewhjklnop'", "ewhjklnop", HumanEval89.encrypt("asdfghjkl"));
        assertEquals(encrypt + " should encrypt 'gf' to 'kj'", "kj", HumanEval89.encrypt("gf"));
        assertEquals(encrypt + " should encrypt 'et' to 'ix'", "ix", HumanEval89.encrypt("et"));

        assertEquals(encrypt + " should encrypt 'faewfawefaewg' to 'jeiajeaijeiak'", "jeiajeaijeiak", HumanEval89.encrypt("faewfawefaewg"));
        assertEquals(encrypt + " should encrypt 'hellomyfriend' to 'lippsqcjvmirh'", "lippsqcjvmirh", HumanEval89.encrypt("hellomyfriend"));
        assertEquals(encrypt + " should encrypt 'dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh' to 'hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl'", 
                "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", HumanEval89.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));

        // Check some edge cases that are easy to work out by hand.
        assertEquals(encrypt + " should encrypt 'a' to 'e'", "e", HumanEval89.encrypt("a"));
    }
}
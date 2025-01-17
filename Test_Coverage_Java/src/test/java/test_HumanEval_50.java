import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval50Test {

    @Test
    public void testHumanEval50() {
        // Generate a random string of length between 10 and 20 characters
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < randint(10, 20); i++) {
            char c = (char) ('a' + randint(0, 25));
            str.append(c);
        }

        // Encode the string using shift encryption
        String encodedStr = encodeShift(str.toString());

        // Check if decoding returns the original string
        String decodedStr = decodeShift(encodedStr);
        assertEquals(str.toString(), decodedStr);
    }

    // Note: The implementation of encodeShift and decodeShift are not provided here as they are assumed to be part of another class or package.
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HumanEval162Test {

    @Test
    public void test_HumanEval_162() {
        // Check some simple cases
        String expected = "3e25960a79dbc69b674cd4ec67a72c62";
        assertEquals(expected, stringToMd5("Hello world"));
        
        assertEquals(null, stringToMd5(""));
        
        expected = "0ef78513b0cb8cef12743f5aeb35f888";
        assertEquals(expected, stringToMd5("A B C"));
        
        expected = "5f4dcc3b5aa765d61d8327deb882cf99";
        assertEquals(expected, stringToMd5("password"));
        
        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }

    private String stringToMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
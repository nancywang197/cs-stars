package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_50;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class HumanEval_50Test {

    private final HumanEval_50 humanEval_50 = new HumanEval_50();
    private final Random random = new Random();
    private final String letters = "abcdefghijklmnopqrstuvwxyz";

    @Test
    public void testEncodeDecode() {
        for (int i = 0; i < 100; i++) {
            String str = generateRandomString(10, 20);
            String encodedStr = humanEval_50.encode_shift(str);
            assertEquals(str, humanEval_50.decode_shift(encodedStr));
        }
    }

    private String generateRandomString(int minLength, int maxLength) {
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(letters.charAt(random.nextInt(letters.length())));
        }
        return sb.toString();
    }
}

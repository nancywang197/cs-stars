package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_38;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class HumanEval_38Test {

    @Test
    public void testDecodeCyclic() {
        HumanEval_38 he = new HumanEval_38();
        Random random = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 100; i++) {
            int len = random.nextInt(11) + 10; // length between 10 and 20
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                sb.append(letters.charAt(random.nextInt(26)));
            }
            String str = sb.toString();
            String encodedStr = he.encode_cyclic(str);
            assertEquals(str, he.decode_cyclic(encodedStr));
        }
    }
}

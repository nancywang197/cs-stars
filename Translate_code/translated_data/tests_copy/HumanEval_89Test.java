package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_89;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_89Test {

    HumanEval_89 encryptor = new HumanEval_89();

    @Test
    public void testSimpleCases() {
        assertEquals("lm", encryptor.encrypt("hi"));
        assertEquals("ewhjklnop", encryptor.encrypt("asdfghjkl"));
        assertEquals("kj", encryptor.encrypt("gf"));
        assertEquals("ix", encryptor.encrypt("et"));
    }

    @Test
    public void testLongerStrings() {
        assertEquals("jeiajeaijeiak", encryptor.encrypt("faewfawefaewg"));
        assertEquals("lippsqcjvmirh", encryptor.encrypt("hellomyfriend"));
        assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", encryptor.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("e", encryptor.encrypt("a"));
    }
}

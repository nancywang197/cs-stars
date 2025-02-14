package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_14;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HumanEval_14Test {

    @Test
    public void testAllPrefixesEmpty() {
        HumanEval_14 tester = new HumanEval_14();
        assertEquals(List.of(), tester.all_prefixes(""));
    }

    @Test
    public void testAllPrefixesAsdfgh() {
        HumanEval_14 tester = new HumanEval_14();
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), tester.all_prefixes("asdfgh"));
    }

    @Test
    public void testAllPrefixesWWW() {
        HumanEval_14 tester = new HumanEval_14();
        assertEquals(Arrays.asList("W", "WW", "WWW"), tester.all_prefixes("WWW"));
    }
}

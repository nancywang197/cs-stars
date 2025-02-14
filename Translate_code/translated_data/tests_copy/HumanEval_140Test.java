package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_140;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_140Test {

    private final HumanEval_140 humanEval_140 = new HumanEval_140();

    @Test
    public void testSimpleCases() {
        assertEquals("Example", humanEval_140.fix_spaces("Example"));
        assertEquals("Mudasir_Hanif_", humanEval_140.fix_spaces("Mudasir Hanif "));
        assertEquals("Yellow_Yellow__Dirty__Fellow", humanEval_140.fix_spaces("Yellow Yellow  Dirty  Fellow"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("Exa-mple", humanEval_140.fix_spaces("Exa   mple"));
        assertEquals("-Exa_1_2_2_mple", humanEval_140.fix_spaces("   Exa 1 2 2 mple"));
    }
}

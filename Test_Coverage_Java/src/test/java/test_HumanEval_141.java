import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_141Test {

    @Test
    public void test_HumanEval_141() {
        // Check some simple cases
        assertEquals("Yes", functions.HumanEval_141.file_name_check("example.txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("1example.dll"));
        assertEquals("No", functions.HumanEval_141.file_name_check("s1sdf3.asd"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("K.dll"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("MY16FILE3.exe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("His12FILE94.exe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("_Y.txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("?aREYA.exe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("/this_is_valid.dll"));
        assertEquals("No", functions.HumanEval_141.file_name_check("this_is_valid.wow"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("this_is_valid.txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("this_is_valid.txtexe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("#this2_i4s_5valid.ten"));
        assertEquals("No", functions.HumanEval_141.file_name_check("@this1_is6_valid.exe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("this_is_12valid.6exe4.txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("all.exe.txt"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("I563_No.exe"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("Is3youfault.txt"));
        assertEquals("Yes", functions.HumanEval_141.file_name_check("no_one#knows.dll"));
        assertEquals("No", functions.HumanEval_141.file_name_check("1I563_Yes3.exe"));
        assertEquals("No", functions.HumanEval_141.file_name_check("I563_Yes3.txtt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("final..txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("final132"));
        assertEquals("No", functions.HumanEval_141.file_name_check("_f4indsartal132."));

        // Check some edge cases that are easy to work out by hand.
        assertEquals("No", functions.HumanEval_141.file_name_check(".txt"));
        assertEquals("No", functions.HumanEval_141.file_name_check("s."));
    }
}
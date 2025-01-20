import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_141Test {

    @Test
    public void testFileNameCheck() {
        HumanEval_141 checker = new HumanEval_141();

        assertEquals("Yes", checker.file_name_check("example.txt"));
        assertEquals("No", checker.file_name_check("1example.dll"));
        assertEquals("No", checker.file_name_check("s1sdf3.asd"));
        assertEquals("Yes", checker.file_name_check("K.dll"));
        assertEquals("Yes", checker.file_name_check("MY16FILE3.exe"));
        assertEquals("No", checker.file_name_check("His12FILE94.exe"));
        assertEquals("No", checker.file_name_check("_Y.txt"));
        assertEquals("No", checker.file_name_check("?aREYA.exe"));
        assertEquals("No", checker.file_name_check("/this_is_valid.dll"));
        assertEquals("No", checker.file_name_check("this_is_valid.wow"));
        assertEquals("Yes", checker.file_name_check("this_is_valid.txt"));
        assertEquals("No", checker.file_name_check("this_is_valid.txtexe"));
        assertEquals("No", checker.file_name_check("#this2_i4s_5valid.ten"));
        assertEquals("No", checker.file_name_check("@this1_is6_valid.exe"));
        assertEquals("No", checker.file_name_check("this_is_12valid.6exe4.txt"));
        assertEquals("No", checker.file_name_check("all.exe.txt"));
        assertEquals("Yes", checker.file_name_check("I563_No.exe"));
        assertEquals("Yes", checker.file_name_check("Is3youfault.txt"));
        assertEquals("Yes", checker.file_name_check("no_one#knows.dll"));
        assertEquals("No", checker.file_name_check("1I563_Yes3.exe"));
        assertEquals("No", checker.file_name_check("I563_Yes3.txtt"));
        assertEquals("No", checker.file_name_check("final..txt"));
        assertEquals("No", checker.file_name_check("final132"));
        assertEquals("No", checker.file_name_check("_f4indsartal132."));

        // Edge cases
        assertEquals("No", checker.file_name_check(".txt"));
        assertEquals("No", checker.file_name_check("s."));
    }
}

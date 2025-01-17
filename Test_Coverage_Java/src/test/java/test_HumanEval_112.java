import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval112Test {

    @Test
    public void test_HumanEval_112() {
 
        String result1 = reverse_delete("abcde", "ae");
        assertEquals("bcd", result1.substring(0, result1.length() - 1));
        assertTrue(result1.endsWith(String.valueOf(false)));
        
        String result2 = reverse_delete("abcdef", "b");
        assertEquals("acdef", result2.substring(0, result2.length() - 1));
        assertTrue(result2.endsWith(String.valueOf(false)));

        String result3 = reverse_delete("abcdedcba", "ab");
        assertEquals("cdedc", result3);
        assertTrue(result3.equals(String.valueOf(true)));
        
        String result4 = reverse_delete("dwik", "w");
        assertEquals("dik", result4.substring(0, result4.length() - 1));
        assertTrue(result4.endsWith(String.valueOf(false)));

        String result5 = reverse_delete("a", "a");
        assertTrue(result5.equals(String.valueOf(true)));
        
        String result6 = reverse_delete("abcdedcba", "");
        assertEquals("abcdedcba", result6);
        assertTrue(result6.equals(String.valueOf(true)));

        String result7 = reverse_delete("abcdedcba", 'v');
        assertEquals("abcdedcba", result7);
        assertTrue(result7.equals(String.valueOf(true)));
        
        String result8 = reverse_delete("vabba", 'v');
        assertEquals("abba", result8);
        assertTrue(result8.equals(String.valueOf(true)));

        String result9 = reverse_delete("mamma", "mia");
        assertTrue(result9.equals(String.valueOf(true)));
    }
}
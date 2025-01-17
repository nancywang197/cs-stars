import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval158Test {

    @Test
    public void test_HumanEval_158() {
 
     // Check some simple cases
     assertEquals("string", findMax(new String[] {"name", "of", "string"}));
     assertEquals("enam", findMax(new String[] {"name", "enam", "game"}));
     assertEquals("aaaaaaa", findMax(new String[] {"aaaaaaa", "bb", "cc"}));
     assertEquals("abc", findMax(new String[] {"abc", "cba"}));
     assertEquals("footbott", findMax(new String[] {"play", "this", "game", "of","footbott"}));
     assertEquals("gonna", findMax(new String[] {"we", "are", "gonna", "rock"}));
     assertEquals("nation", findMax(new String[] {"we", "are", "a", "mad", "nation"}));
     assertEquals("this", findMax(new String[] {"this", "is", "a", "prrk"}));

     // Check some edge cases that are easy to work out by hand.
     assertEquals("b", findMax(new String[] {"b"}));
     assertEquals("play", findMax(new String[] {"play", "play", "play"}));
 
    }
}

public class Functions {

    public static String findMax(String[] array) {
        String max = "";
        for (String s : array) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        return max;
    }

}
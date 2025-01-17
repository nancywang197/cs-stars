import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_156 {

    public String intToMiniRoman(int num) {
        int[] val = {1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        String[] syb = {"M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"};
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<val.length; i++) {
            while (num >= val[i]) {
                num -= val[i];
                sb.append(syb[i]);
            }
        }
        return sb.toString();
    }

    @Test
    public void test_HumanEval_156() {
        // Check some simple cases
        assertEquals("xix", intToMiniRoman(19));
        assertEquals("clii", intToMiniRoman(152));
        assertEquals("ccli", intToMiniRoman(251));
        assertEquals("cdxxvi", intToMiniRoman(426));
        assertEquals("d", intToMiniRoman(500));
        assertEquals("i", intToMiniRoman(1));
        assertEquals("iv", intToMiniRoman(4));
        assertEquals("xliii", intToMiniRoman(43));
        assertEquals("xc", intToMiniRoman(90));
        assertEquals("xciv", intToMiniRoman(94));
        assertEquals("dxxxii", intToMiniRoman(532));
        assertEquals("cm", intToMiniRoman(900));
        assertEquals("cmxciv", intToMiniRoman(994));
        assertEquals("m", intToMiniRoman(1000));

        // Check some edge cases that are easy to work out by hand.
        assertTrue(true);
    }
}
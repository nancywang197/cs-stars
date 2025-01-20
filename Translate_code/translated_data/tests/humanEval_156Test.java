import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_156Test {

    private final HumanEval_156 converter = new HumanEval_156();

    @Test
    public void testIntToMiniRoman() {
        assertEquals("xix", converter.intToMiniRoman(19));
        assertEquals("clii", converter.intToMiniRoman(152));
        assertEquals("ccli", converter.intToMiniRoman(251));
        assertEquals("cdxxvi", converter.intToMiniRoman(426));
        assertEquals("d", converter.intToMiniRoman(500));
        assertEquals("i", converter.intToMiniRoman(1));
        assertEquals("iv", converter.intToMiniRoman(4));
        assertEquals("xliii", converter.intToMiniRoman(43));
        assertEquals("xc", converter.intToMiniRoman(90));
        assertEquals("xciv", converter.intToMiniRoman(94));
        assertEquals("dxxxii", converter.intToMiniRoman(532));
        assertEquals("cm", converter.intToMiniRoman(900));
        assertEquals("cmxciv", converter.intToMiniRoman(994));
        assertEquals("m", converter.intToMiniRoman(1000));
    }
}

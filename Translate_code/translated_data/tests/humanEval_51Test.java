import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveVowelsTest {

    private final RemoveVowels remover = new RemoveVowels();

    @Test
    public void testEmpty() {
        assertEquals("", remover.removeVowels(""));
    }

    @Test
    public void testMixedCase() {
        assertEquals("bcdf\nghjklm", remover.removeVowels("abcdef\nghijklm"));
    }

    @Test
    public void testReverse() {
        assertEquals("fdcb", remover.removeVowels("fedcba"));
    }

    @Test
    public void testAllVowels() {
        assertEquals("", remover.removeVowels("eeeee"));
    }

    @Test
    public void testMixedVowelsConsonants() {
        assertEquals("cB", remover.removeVowels("acBAA"));
    }

    @Test
    public void testUppercaseVowels() {
        assertEquals("cB", remover.removeVowels("EcBOO"));
    }

    @Test
    public void testNoVowels() {
        assertEquals("ybcd", remover.removeVowels("ybcd"));
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import HumanEval_93; // Assuming HumanEval_93.java is in the same directory

public class HumanEval_93Test {

    HumanEval_93 encoder = new HumanEval_93();

    @Test
    public void testSimpleCases() {
        assertEquals("tgst", encoder.encode("TEST"));
        assertEquals("mWDCSKR", encoder.encode("Mudasir"));
        assertEquals("ygs", encoder.encode("YES"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("tHKS KS C MGSSCGG", encoder.encode("This is a message"));
        assertEquals("k dQnT kNqW wHcT Tq wRkTg", encoder.encode("I DoNt KnOw WhAt tO WrItE"));
    }
}

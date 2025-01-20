import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;


public class HumanEval_117Test {

    @Test
    public void testSelectWords() {
        HumanEval_117 solver = new HumanEval_117();
        assertEquals(Arrays.asList("little"), solver.selectWords("Mary had a little lamb", 4));
        assertEquals(Arrays.asList("Mary", "lamb"), solver.selectWords("Mary had a little lamb", 3));
        assertEquals(Arrays.asList(), solver.selectWords("simple white space", 2));
        assertEquals(Arrays.asList("world"), solver.selectWords("Hello world", 4));
        assertEquals(Arrays.asList("Uncle"), solver.selectWords("Uncle sam", 3));
        assertEquals(Arrays.asList(), solver.selectWords("", 4));
        assertEquals(Arrays.asList("b", "c", "d", "f"), solver.selectWords("a b c d e f", 1));
    }
}

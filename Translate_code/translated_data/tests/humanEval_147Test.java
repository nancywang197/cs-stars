import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_147Test {

    @Test
    public void testGetMaxTriples() {
        HumanEval_147 solution = new HumanEval_147();
        assertEquals(1, solution.get_max_triples(5));
        assertEquals(4, solution.get_max_triples(6));
        assertEquals(36, solution.get_max_triples(10));
        assertEquals(53361, solution.get_max_triples(100));
    }
}

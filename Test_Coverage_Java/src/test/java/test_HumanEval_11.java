import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_11Test {

    @Test
    public void test_HumanEval_11() {
        assertEquals("010010", HumanEval_11.string_xor("111000", "101010"));
        assertEquals("0", HumanEval_11.string_xor("1", "1"));
        assertEquals("0101", HumanEval_11.string_xor("0101", "0000"));
    }
}
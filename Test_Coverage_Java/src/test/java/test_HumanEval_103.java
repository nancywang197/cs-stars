import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval103Test {

    private String roundedAvg(int a, int b) {
        long sum = (long) a + b;
        if (sum > 1000) {
            return Long.toBinaryString(sum);
        } else {
            return "-1";
        }
    }

    @Test
    public void test_HumanEval_103() {
        assertEquals("0b11", roundedAvg(1, 5));
        assertEquals("0b1010", roundedAvg(7, 13));
        assertEquals("0b1111001010", roundedAvg(964,977));
        assertEquals("0b1111100100", roundedAvg(996,997));
        assertEquals("0b1011000010", roundedAvg(560,851));
        assertEquals("0b101101110", roundedAvg(185,546));
        assertEquals("0b110101101", roundedAvg(362,496));
        assertEquals("0b1001110010", roundedAvg(350,902));
        assertEquals("0b11010111", roundedAvg(197,233));

        assertEquals(-1, roundedAvg(7, 5));
        assertEquals(-1, roundedAvg(5, 1));
        assertEquals("0b101", roundedAvg(5, 5));
    }
}
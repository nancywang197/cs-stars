import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_66Test {

    @Test
    public void testDigitSum() {
        HumanEval_66 digitSum = new HumanEval_66();
        assertEquals(0, digitSum.digitSum(""));
        assertEquals(131, digitSum.digitSum("abAB"));
        assertEquals(67, digitSum.digitSum("abcCd"));
        assertEquals(69, digitSum.digitSum("helloE"));
        assertEquals(131, digitSum.digitSum("woArBld"));
        assertEquals(153, digitSum.digitSum("aAaaaXa"));
        assertEquals(151, digitSum.digitSum(" How are yOu?"));
        assertEquals(327, digitSum.digitSum("You arE Very Smart"));
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_94Test {

    @Test
    public void testSkjkasdkd1() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(10, obj.skjkasdkd(new int[]{0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3}));
    }

    @Test
    public void testSkjkasdkd2() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(25, obj.skjkasdkd(new int[]{1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1}));
    }

    @Test
    public void testSkjkasdkd3() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(13, obj.skjkasdkd(new int[]{1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3}));
    }

    @Test
    public void testSkjkasdkd4() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(11, obj.skjkasdkd(new int[]{0,724,32,71,99,32,6,0,5,91,83,0,5,6}));
    }

    @Test
    public void testSkjkasdkd5() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(3, obj.skjkasdkd(new int[]{0,81,12,3,1,21}));
    }

    @Test
    public void testSkjkasdkd6() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(7, obj.skjkasdkd(new int[]{0,8,1,2,1,7}));
    }

    @Test
    public void testSkjkasdkd7() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(19, obj.skjkasdkd(new int[]{8191}));
    }

    @Test
    public void testSkjkasdkd8() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(19, obj.skjkasdkd(new int[]{8191, 123456, 127, 7}));
    }

    @Test
    public void testSkjkasdkd9() {
        HumanEval_94 obj = new HumanEval_94();
        assertEquals(10, obj.skjkasdkd(new int[]{127, 97, 8192}));
    }
}

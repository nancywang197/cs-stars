import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_35Test {
    HumanEval_35 he35 = new HumanEval_35();

    @Test
    public void test1(){
        assertEquals(3, he35.max_element(new int[]{1, 2, 3}));
    }

    @Test
    public void test2(){
        assertEquals(124, he35.max_element(new int[]{5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10}));
    }
}

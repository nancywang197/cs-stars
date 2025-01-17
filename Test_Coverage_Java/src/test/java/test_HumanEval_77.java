import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval77Test {

    @Test
    public void test_HumanEval_77() {
 
     // Check some simple cases
     assertTrue(HumanEval77.iscube(1));
     assertFalse(HumanEval77.iscube(2));
     assertTrue(HumanEval77.iscube(-1));
     assertTrue(HumanEval77.iscube(64));
     assertFalse(HumanEval77.iscube(180));
     assertTrue(HumanEval77.iscube(1000));
 
 
     // Check some edge cases that are easy to work out by hand.
     assertTrue(HumanEval77.iscube(0));
     assertFalse(HumanEval77.iscube(1729)); 
    }
}
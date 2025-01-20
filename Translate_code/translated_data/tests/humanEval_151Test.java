import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_151Test {

    @Test
    public void testSimpleCases() {
        HumanEval_151 tester = new HumanEval_151();
        assertEquals(0, tester.double_the_difference(new int[]{}));
        assertEquals(25, tester.double_the_difference(new int[]{5, 4}));
        assertEquals(0, tester.double_the_difference(new int[]{0})); //Added this test case for completeness
        assertEquals(0, tester.double_the_difference(new int[]{0,0,0})); //Added this test case for completeness
        assertEquals(0, tester.double_the_difference(new int[]{-10, -20, -30}));
        assertEquals(0, tester.double_the_difference(new int[]{1, -1})); //Added this test case to address edge case better

    }


    @Test
    public void testEdgeCases() {
        HumanEval_151 tester = new HumanEval_151();
        assertEquals(0, tester.double_the_difference(new int[]{-1, -2, 8}));
        assertEquals(34, tester.double_the_difference(new int[]{3, 5})); //Corrected input to match expected output.  Original Python test had a 0.2 which is handled differently.
        
        int[] lst = new int[100];
        int k=0;
        for(int i = -99; i < 100; i+=2){
            lst[k++] = i;
        }

        int odd_sum = 0;
        for (int i : lst) {
            if (i > 0 && i % 2 != 0) {
                odd_sum += i * i;
            }
        }
        assertEquals(odd_sum, tester.double_the_difference(lst));
    }

    @Test
    public void testDecimalInputs(){
        HumanEval_151 tester = new HumanEval_151();
        assertEquals(0, tester.double_the_difference(new int[]{1,2,3,4,5,6,7,8,9,10})); //Added test to confirm correct handling of integers
        assertEquals(0, tester.double_the_difference(new int[]{(int)0.1, (int)0.2, (int)0.3})); //Casting to int to address the implicit type conversion in Python
    }
}

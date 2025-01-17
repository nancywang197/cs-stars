import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval_70Test {

    @Test
    public void test_HumanEval_70_SimpleCases() {
        // Check some simple cases
        int[] input1 = {1, 2, 3, 4};
        int[] expected1 = {1, 4, 2, 3};
        assertEquals(expected1, strange_sort_list(input1));
        
        int[] input2 = {5, 6, 7, 8, 9};
        int[] expected2 = {5, 9, 6, 8, 7};
        assertEquals(expected2, strange_sort_list(input2));
        
        int[] input3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 5, 2, 4, 3};
        assertEquals(expected3, strange_sort_list(input3));
        
        int[] input4 = {5, 6, 7, 8, 9, 1};
        int[] expected4 = {1, 9, 5, 8, 6, 7};
        assertEquals(expected4, strange_sort_list(input4));
        
        int[] input5 = {5, 5, 5, 5};
        int[] expected5 = {5, 5, 5, 5};
        assertEquals(expected5, strange_sort_list(input5));
        
        int[] input6 = {};
        int[] expected6 = {};
        assertEquals(expected6, strange_sort_list(input6));
        
        int[] input7 = {1,2,3,4,5,6,7,8};
        int[] expected7 = {1, 8, 2, 7, 3, 6, 4, 5};
        assertEquals(expected7, strange_sort_list(input7));
        
        int[] input8 = {0,2,2,2,5,5,-5,-5};
        int[] expected8 = {-5, 5, -5, 5, 0, 2, 2, 2};
        assertEquals(expected8, strange_sort_list(input8));
        
        int[] input9 = {111111};
        int[] expected9 = {111111};
        assertEquals(expected9, strange_sort_list(input9));
    }

}
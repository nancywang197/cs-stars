package com.example.python_to_java.tests_copy;
import com.example.python_to_java.functions_copy.HumanEval_129;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class HumanEval_129Test {

    @Test
    public void testMinPath() {
        HumanEval_129 solver = new HumanEval_129();
        assertEquals(Arrays.asList(1, 2, 1), solver.minPath(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 3));
        assertEquals(Arrays.asList(1), solver.minPath(new int[][]{{5, 9, 3}, {4, 1, 6}, {7, 8, 2}}, 1));
        assertEquals(Arrays.asList(1, 2, 1, 2), solver.minPath(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, 4));
        assertEquals(Arrays.asList(1, 10, 1, 10, 1, 10, 1), solver.minPath(new int[][]{{6, 4, 13, 10}, {5, 7, 12, 1}, {3, 16, 11, 15}, {8, 14, 9, 2}}, 7));
        assertEquals(Arrays.asList(1, 7, 1, 7, 1), solver.minPath(new int[][]{{8, 14, 9, 2}, {6, 4, 13, 15}, {5, 7, 1, 12}, {3, 10, 11, 16}}, 5));
        assertEquals(Arrays.asList(1, 6, 1, 6, 1, 6, 1, 6, 1), solver.minPath(new int[][]{{11, 8, 7, 2}, {5, 16, 14, 4}, {9, 3, 15, 6}, {12, 13, 10, 1}}, 9));
        assertEquals(Arrays.asList(1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6), solver.minPath(new int[][]{{12, 13, 10, 1}, {9, 3, 15, 6}, {5, 16, 14, 4}, {11, 8, 7, 2}}, 12));
        assertEquals(Arrays.asList(1, 3, 1, 3, 1, 3, 1, 3), solver.minPath(new int[][]{{2, 7, 4}, {3, 1, 5}, {6, 8, 9}}, 8));
        assertEquals(Arrays.asList(1, 5, 1, 5, 1, 5, 1, 5), solver.minPath(new int[][]{{6, 1, 5}, {3, 8, 9}, {2, 7, 4}}, 8));
        assertEquals(Arrays.asList(1, 2, 1, 2, 1, 2, 1, 2, 1, 2), solver.minPath(new int[][]{{1, 2}, {3, 4}}, 10));
        assertEquals(Arrays.asList(1, 3, 1, 3, 1, 3, 1, 3, 1, 3), solver.minPath(new int[][]{{1, 3}, {3, 2}}, 10));
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval87Test {

    @Test
    public void testGetRow_SimpleCases() {
        int[][] matrix = {{1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 1, 6},
                {1, 2, 3, 4, 5, 1}};

        int[] expected = {(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)};
        assertEquals(expected, HumanEval87.getRow(matrix, 1));

        matrix = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}
        };

        expected = {(0, 1), (1, 1), (2, 1), (3, 1), (4, 1), (5, 1)};
        assertEquals(expected, HumanEval87.getRow(matrix, 2));

        matrix = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 1, 3, 4, 5, 6},
                {1, 2, 1, 4, 5, 6},
                {1, 2, 3, 1, 5, 6},
                {1, 2, 3, 4, 1, 6},
                {1, 2, 3, 4, 5, 1}
        };

        expected = {(0, 0), (1, 0), (2, 1), (2, 0), (3, 2), (3, 0), (4, 3), (4, 0), (5, 4), (5, 0), (6, 5), (6, 0)};
        assertEquals(expected, HumanEval87.getRow(matrix, 1));

        int[][] emptyMatrix = {};
        assertEquals([], HumanEval87.getRow(emptyMatrix, 1));
    }

    @Test
    public void testGetRow_NoSecondRow() {
        int[][] matrix = {{1}};
        assertEquals([], HumanEval87.getRow(matrix, 2));
    }

    @Test
    public void testGetRow_DifferentNumberOfRows() {
        int[][] matrix = { new int[]{1}, new int[] {1, 2, 3}, new int[] {1, 2, 3, 4}};
        assertEquals(new int[] {(2, 2)}, HumanEval87.getRow(matrix, 3));
    }

    // This test is similar to the original Python test but since we're not using assert True,
    // there's no direct equivalent here.

}
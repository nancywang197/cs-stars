import java.util.ArrayList;
import java.util.List;

class HumanEval_129 {
    /**
     * @param grid The input grid
     * @param k    The number of elements in the output array
     * @return An array of integers
     */
    public List<Integer> minPath(int[][] grid, int k) {
        int n = grid.length;
        int val = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    List<Integer> temp = new ArrayList<>();
                    if (i != 0) {
                        temp.add(grid[i - 1][j]);
                    }
                    if (j != 0) {
                        temp.add(grid[i][j - 1]);
                    }
                    if (i != n - 1) {
                        temp.add(grid[i + 1][j]);
                    }
                    if (j != n - 1) {
                        temp.add(grid[i][j + 1]);
                    }
                    int minVal = Integer.MAX_VALUE;
                    for(int num : temp){
                        minVal = Math.min(minVal, num);
                    }
                    val = minVal;

                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                ans.add(1);
            } else {
                ans.add(val);
            }
        }
        return ans;
    }
}

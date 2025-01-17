import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> minPath(int[][] grid, int k) {
        int n = grid.length;
        int val = n * n + 1;

        // Find the value in the grid that is closest to each cell with a value of 1
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
                    
                    // Update the value that is closest to cell with a value of 1
                    val = Math.min(val, temp.get(temp.size() - 1));
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

    , {0, 1, 0}, {0, 0, 0}};
        int k = 3;
        List<Integer> result = minPath(grid, k);
        System.out.println(result);
    }
}
package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanEval_87 {
    /**
     * Given a 2D list and a value x, find all coordinates (i, j) where lst[i][j] == x.
     * Return the coordinates sorted first by row index (ascending) and then by column index (descending).
     *
     * @param lst The 2D list to search.
     * @param x The value to search for.
     * @return A list of coordinates (i, j) where lst[i][j] == x, sorted as described above.
     */
    public List<int[]> get_row(List<List<Integer>> lst, int x) {
        List<int[]> coords = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            for (int j = 0; j < lst.get(i).size(); j++) {
                if (lst.get(i).get(j) == x) {
                    coords.add(new int[]{i, j});
                }
            }
        }

        Collections.sort(coords, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] != b[1]) {
                    return b[1] - a[1]; //Sort by column descending
                } else {
                    return a[0] - b[0]; //Sort by row ascending
                }
            }
        });


        return coords;
    }
}

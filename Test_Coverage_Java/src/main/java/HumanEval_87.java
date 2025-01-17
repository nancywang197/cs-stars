import java.util.*;

public class Main {

    public static List<int[]> getRow(List<List<Integer>> lst, int x) {
        // Find coordinates where value equals x and store them in a list
        List<int[]> coords = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            for (int j = 0; j < lst.get(i).size(); j++) {
                if (lst.get(i).get(j) == x) {
                    coords.add(new int[] {i, j});
                }
            }
        }

        // Sort the coordinates based on row and then column
        Collections.sort(coords, (a, b) -> {
            int rowCompare = a[0] - b[0];
            if (rowCompare != 0) return rowCompare;
            else return b[1] - a[1];
        });

        return coords;
    }

    
}
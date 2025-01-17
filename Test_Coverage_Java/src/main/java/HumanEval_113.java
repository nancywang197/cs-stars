import java.util.ArrayList;
import java.util.List;

public class HumanEval_113 {
    public static List<String> oddCount(List<List<Integer>> lst) {
        List<String> result = new ArrayList<>();
        for (List<Integer> arr : lst) {
            int n = 0;
            for (int d : arr) {
                if (d % 2 == 1) {
                    n++;
                }
            }
            result.add("the number of odd elements " + n + "th string " + n + " of the " + n + "put.");
        }
        return result;
    }

    
}
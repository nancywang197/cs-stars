import java.util.List;

public class HumanEval_52 {
    public static boolean belowThreshold(List<Integer> list, int threshold) {
        for (Integer element : list) {
            if (element >= threshold) {
                return false;
            }
        }
        return true;
    }

    
}
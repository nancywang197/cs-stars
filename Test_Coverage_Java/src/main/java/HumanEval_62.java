import java.util.List;
import java.util.ArrayList;

public class HumanEval_62 {
    public static List<Integer> derivative(List<Integer> xs) {
        int resultSize = xs.size() - 1;
        Integer[] result = new Integer[resultSize];

        for (int i = 0; i < resultSize; i++) {
            result[i] = (i + 1) * xs.get(i);
        }

        return new ArrayList<>(java.util.Arrays.asList(result));
    }

    
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> generateIntegers(int a, int b) {
        // Ensure that both parameters are greater than or equal to 2
        int lower = Math.max(2, Math.min(a, b));
        
        // Ensure that the upper bound does not exceed 8
        int upper = Math.min(8, Math.max(a, b));

        // Initialize an empty list to store the result
        List<Integer> result = new ArrayList<>();

        // Iterate over the range from lower to upper (inclusive)
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }

        return result;
    }

    
}